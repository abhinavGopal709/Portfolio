import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

public class zombieAttack extends JFrame implements KeyListener, ActionListener {
	Scanner console = new Scanner(System.in);
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	ImageIcon hero = new ImageIcon(getClass().getResource("hero.png"));
	ImageIcon enemy =  new ImageIcon(getClass().getResource("zombie.png"));
	ImageIcon zombieBg = new ImageIcon(getClass().getResource("zombieAttackBg.jpg"));
	Timer timer;
	Timer timer2;
	Random randomGen = new Random();
	int xVelocity = 50;
	int yVelocity = 50;
	int reverseXVelocity = -50;
	int reverseYVelocity = -50;
	int x = 0;
	int y = 0;
	int points = 0;
	int getLocationx = 0;
	int getLocationy = 0;
	public zombieAttack(){
//		make sure to add arrow keys for the zombie for the other player to play 
		System.out.println("In this game you must escape the zombie while it chases you the longer you dodge it the more points you gain !");
		System.out.println("Good Luck !");
		label.setIcon(hero);
		label.setBounds(150, 550, hero.getIconHeight(), hero.getIconWidth());
		label2.setIcon(enemy);
		label2.setBounds(150, 250, enemy.getIconHeight(), enemy.getIconWidth()); 
		label3.setIcon(zombieBg);
		this.add(label);
		this.add(label2);
		this.setBackground(getBackground());
		timer = new Timer(500, this);
		timer.start();
		this.addKeyListener(this);
		this.setLayout(null);
		this.setSize(new Dimension(10000, 10000));
		this.getContentPane().setBackground(new Color(100, 155, 0));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(this);
	}
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyChar())
		{
		case 'w' :
			label.setLocation(label.getX(), label.getY() - 50);
			break;
		case 'a' :
			label.setLocation(label.getX() - 50, label.getY());
			break;
		case 's' :
			label.setLocation(label.getX(), label.getY() + 50);
			break;
		case 'd' :
			label.setLocation(label.getX() + 50, label.getY());
			break;
	}
	
}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean superHeroCaught = false;
		if(superHeroCaught == false)
		{
			int choice = randomGen.nextInt(2) + 1;
			if(this.getWidth() > x ||  this.getHeight() > y || x > 10000 || y > 10000)
			{
				if(choice == 1)
				{
					x =  x - reverseXVelocity;
					label2.setLocation(x, y);
					getLocationx = x;
				}
				if(choice == 2)
				{
					y = y - reverseYVelocity;
					label2.setLocation(x, y);
					getLocationy = y;
				}
			}
			else
			{
				if(choice == 1)
				{
					x = x + xVelocity;
					label2.setLocation(x, y);
					getLocationx = x;
				}
				if(choice == 2)
				{
					y = y + yVelocity;
					label2.setLocation(x, y);
					getLocationy = y;
				}
			}
			if(label2.contains(label.getLocation()))
			{
				System.out.println("Nice Try ! But the zombie got you !");
				System.out.println("You got " + points + " points Well done !");
				this.setVisible(false);
				timer.stop();
				if(points == 0)
				{
					System.out.println("Your rank is Amatuer");
				}
				if(points > 0 &&points <= 5)
				{
					System.out.println("Your rank is Proficent");
				}
				if(points > 5 && points <= 10)
				{
					System.out.println("Your rank is Shadow I");
				}
				if(points > 10 &&points <= 15)
				{
					System.out.println("Your rank is Shadow II");
				}
				if(points >= 20 || points > 15)
				{
					System.out.println("Your rank is Shadow III");
				}
			}
			else
			{
				points++;
			}
		}
	}

}
