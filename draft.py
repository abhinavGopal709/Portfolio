import pymunk
import pygame
import pymunk.pygame_util
import math
#
# import math
# import os
# import sys
#
# WIDTH, HEIGHT = 800, 500
# window = pygame.display.set_mode([WIDTH, HEIGHT])
#
#
# pygame.init()
#
#
# def draw(space, window, draw_options):
#     window.fill("white")
#     space.debug_draw(draw_options)
#     pygame.display.update()
#
#
# def run(window, width, height):
#     run = True
#     clock = pygame.time.Clock()
#     fps = 60
#     dt = 1 / fps
#     space = pymunk.Space()
#     space.gravity = (0, -981)
#
#     draw_options = pymunk.pygame_util.DrawOptions(window)
#     while run:
#         for event in pygame.event.get():
#             if event.type == pygame.QUIT:
#                 run = False
#                 break
#         draw(space, window, draw_options)
#         space.step(dt)
#         clock.tick(fps)
#
#     pygame.quit()
#
#
# if __name__ == "main":
#
#     run(window, WIDTH, HEIGHT)
pygame. init()


WIDTH = 1200
HEIGHT = 700


screen = pygame.display.set_mode([WIDTH, HEIGHT])
pygame.display.set_caption ('Pygame Movement!')

# pymunk space
space = pymunk.Space()
static_body = space.static_body
draw_options = pymunk.pygame_util.DrawOptions(screen)

# load images
cue_image = pygame.image.load("cue.png")
table_image = pygame.image.load("table.png").convert_alpha()
ball_images = []
for i in range(1, 17):
    ball_image = pygame.image.load(f"ball_{i}.png").convert_alpha()
    ball_images.append(ball_image)

# function for creating balls
def create_ball(radius, pos):
    body = pymunk.Body()
    body.position = pos
    shape = pymunk.Circle(body, radius)
    shape.mass = 5
    shape.elasticity = 0.8
    # use pivot joint to add friction
    pivot = pymunk.PivotJoint(static_body, body, (0,0), (0,0))
    pivot.max_bias = 0 # disable joint correction
    pivot.max_force = 10   #emulate linear friction

    space.add(body, shape, pivot)
    return shape

# game variables
dia = 36
pocket_dia = 66
force = 0
max_force = 10000
force_direction = 1
taking_shot = True
powering_up = False
potted_balls = []

# colours
BG = (50,50,50)
RED = (255, 0, 0)

# setup game balls
balls = []
rows = 5
# potting balls
for col in range(5):
    for row in range(rows):
        pos = (250 + (col * (dia+1)), 267 + (row * (dia+1)) + (col * dia /2 ))
        new_ball = create_ball(dia/2, pos)
        balls.append(new_ball)
    rows-= 1
# cue ball
pos = (888, HEIGHT/2)
cue_ball = create_ball(dia , pos)
balls.append(cue_ball)

# create six pockets on table
pockets = [
(55, 63),
(592, 48),
(1134, 64),
(55, 616),
(592, 629),
(1134, 616)
]

# function for creating cushions
cushions = [
  [(88, 56), (109, 77), (555, 77), (564, 56)],
  [(621, 56), (630, 77), (1081, 77), (1102, 56)],
  [(89, 621), (110, 600),(556, 600), (564, 621)],
  [(622, 621), (630, 600), (1081, 600), (1102, 621)],
  [(56, 96), (77, 117), (77, 560), (56, 581)],
  [(1143, 96), (1122, 117), (1122, 560), (1143, 581)]
]


def create_cushion(poly_dims):
    body = pymunk.Body(body_type = pymunk.Body.STATIC)
    body.position = ((0,0))
    shape = pymunk.Poly(body, poly_dims)
    shape.elasticity = 0.8

    space.add(body, shape)


for c in cushions:
    create_cushion(c)

# create pool cue
class Cue():
    def __init__(self,pos):
        self.original_image = cue_image
        self.angle = 0
        self.image = pygame.transform.rotate(self.original_image, self.angle)
        self.rect = self.image.get_rect()
        self.rect.center = pos
    def update(self, angle):
        self.angle = angle
    def draw(self,surface):
        self.image = pygame.transform.rotate(self.original_image, self.angle)
        surface.blit(self.image,
                     (self.rect.centerx - self.image.get_width() / 2,
                     self.rect.centery - self.image.get_height() / 2)
                     )



cue = Cue(balls[-1].body.position)

# create power bars to show how hard the ball is hitting
power_bar = pygame.Surface((10, 20))
power_bar.fill(RED)

timer = pygame.time.Clock()
fps = 120

run = True
while run:
    timer.tick(fps)
    space.step(1/fps)
    screen.fill('black')
    # draw pool table
    screen.blit(table_image, (0,0))
    # draw pool balls
    for i, ball in enumerate(balls):
        screen.blit(ball_images[i], (ball.body.position[0] - ball.radius, ball.body.position[1] - ball.radius))

    # check if all the balls have stopped moving
    taking_shot = True
    for ball in balls:
        if int(ball.body.velocity[0]) != 0 or int(ball.body.velocity[1]) !=0:
            taking_shot = False

    # draw pool cue
    if taking_shot == True:
        # calculate pool cue angle
        mouse_pos = pygame.mouse.get_pos()
        cue.rect.center = balls[-1].body.position
        x_dist = balls[-1].body.position[0] - mouse_pos[0]
        y_dist = -(balls[-1].body.position[1] - mouse_pos[1]) # negative because pygame y coordinates increases downwards
        cue_angle = math.degrees(math.atan2(y_dist, x_dist))
        cue.update(cue_angle)
        cue.draw(screen)

    # power up pool cue
    if powering_up:
        force+= 100 * force_direction
        if force >= max_force or force <= 0:
            force_direction*= -1
        # draw power bars
        for b in range(math.ceil(force / 2000)):
            screen.blit(power_bar, (balls[-1].body.position[0] - 30 + (b*15),
                                    balls[-1].body.position[1]+ 30))
    elif not powering_up and taking_shot :
        x_impulse = math.cos(math.radians(cue_angle))
        y_impulse = math.sin(math.radians(cue_angle))
        balls[-1].body.apply_impulse_at_local_point((force * -x_impulse, force * y_impulse), (0, 0))
        force = 0
        force_direction = 1

    # event handler
    for event in pygame.event.get():
        if event.type == pygame.MOUSEBUTTONDOWN and taking_shot :
            powering_up = True
        if event.type == pygame.MOUSEBUTTONUP and taking_shot:
            powering_up = False
        if event.type == pygame. QUIT:
            run = False
    # space.debug_draw(draw_options)
    pygame.display.update()
    pygame.display.flip()
pygame.quit()