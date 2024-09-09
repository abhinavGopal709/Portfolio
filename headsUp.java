import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class headsUp extends JFrame implements KeyListener, ActionListener {
	Random randomGen = new Random();
	Timer timer;
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	ImageIcon hero = new ImageIcon(getClass().getResource("mainCharacter.png"));
	ImageIcon projectile = new ImageIcon(getClass().getResource("projectile.png"));
	int x = 50;
	int y = 50;
	int xVelocity = 100;
	int yVelocity = 100;
	int score = 0;
	public headsUp() 
	{
		timer = new Timer(1000, this);
		timer.start();
		label.setIcon(hero);
		label.setBounds(550, 350, hero.getIconWidth(), hero.getIconHeight());
		label2.setIcon(projectile);
		label2.setBounds(x, y, projectile.getIconWidth(), projectile.getIconHeight());
		this.add(label);
		this.add(label2);
		this.setLayout(null);
		this.setSize(new Dimension(10000, 10000));
		this.getContentPane().setBackground(new Color(50, 100, 120));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyChar())
		{
		case 'a' :
			label.setLocation(label.getX() - 50, label.getY());
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
		if(this.getHeight() > y)
		{
			y = y + yVelocity;
			label2.setLocation(x, y);
		}
		if(this.getHeight() < y)
		{
			x = x + xVelocity;
			y = 0;
			label2.setLocation(x, y);
		}
		if(label.getY() + 100 == label2.getY() && label.getX() <= label2.getX())
		{
			this.setVisible(false);
			System.out.println("Good Job !");
			System.out.println("Your score is " + score);
			if(score > 0 && score < 6)
			{
				System.out.println("Your rank is Amatuer !");
			}
			if(score > 6 && score  < 20)
			{
				
			}
			timer.stop();
		}
		score++;
		if(this.getWidth() < x)
		{
			x = 0;
			y = 0;
		}
	}
	
}
