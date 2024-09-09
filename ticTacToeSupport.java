import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ticTacToeSupport extends JFrame implements ActionListener{
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton submit = new JButton("Repaint Board");
	ImageIcon xImage = new ImageIcon(getClass().getResource("X.png"));
	ImageIcon yImage = new ImageIcon(getClass().getResource("O.png"));
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel label6 = new JLabel();
	JLabel label7 = new JLabel();
	JLabel label8 = new JLabel();
	JLabel label9 = new JLabel();
	JLabel label10 = new JLabel();
	JLabel label11 = new JLabel();
	JLabel label12 = new JLabel();
	JLabel label13 = new JLabel();
	JLabel label14 = new JLabel();
	JLabel label15 = new JLabel();
	JLabel label16 = new JLabel();
	JLabel label17 = new JLabel();
	JLabel label18 = new JLabel();
	JLabel xWon = new JLabel("X is the Winner");
	JLabel oWon = new JLabel("O is the Winner");
	JLabel tie = new JLabel("It's a Tie !");
	int turn = 1;
	boolean isVisible = false;
	int count = 0;
	ticTacToeSupport() 
	{
		submit.setBounds(1000, 100, 500, 50);
		submit.addActionListener(this);
		button.setBounds(0, 0, 250, 250);
		button.addActionListener(this);
		button2.setBounds(250, 0, 495,250);
		button2.addActionListener(this);
		button3.setBounds(750, 0, 250, 250);
		button3.addActionListener(this);
		button4.setBounds(0, 250, 250, 495);
		button4.addActionListener(this);
		button5.setBounds(0, 750, 250, 250);
		button5.addActionListener(this);
		button6.setBounds(250, 750, 495, 250);
		button6.addActionListener(this);
		button7.setBounds(750, 750, 250, 250);
		button7.addActionListener(this);
		button8.setBounds(750, 250, 250, 495);
		button8.addActionListener(this);
		button9.setBounds(250, 250, 450, 450);
		button9.addActionListener(this);
		this.add(button);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(submit);
		label.setIcon(xImage);
		label.setVisible(false);
		label2.setIcon(yImage);
		label2.setVisible(false);
		label3.setIcon(xImage);
		label3.setVisible(false);
		label4.setIcon(yImage);
		label4.setVisible(false);
		label5.setIcon(xImage);
		label5.setVisible(false);
		label6.setIcon(yImage);
		label6.setVisible(false);
		label7.setIcon(xImage);
		label7.setVisible(false);
		label8.setIcon(yImage);
		label8.setVisible(false);
		label9.setIcon(xImage);
		label9.setVisible(false);
		label10.setIcon(yImage);
		label10.setVisible(false);
		label11.setIcon(xImage);
		label11.setVisible(false);
		label12.setIcon(yImage);
		label12.setVisible(false);
		label13.setIcon(xImage);
		label13.setVisible(false);
		label14.setIcon(yImage);
		label14.setVisible(false);
		label15.setIcon(xImage);
		label15.setVisible(false);
		label16.setIcon(yImage);
		label16.setVisible(false);
		label17.setIcon(xImage);
		label17.setVisible(false);
		label18.setIcon(yImage);
		label18.setVisible(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(10000, 10000));
		this.setLayout(null);
		this.setVisible(true);
	}

	
	public void paint(Graphics g) 
	{
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawLine(250, 0, 250, 1000);
		g2D.drawLine(750, 0, 750, 1000);
		g2D.drawLine(0, 250, 1000, 250);
		g2D.drawLine(0, 750, 1000, 750);
//		this.add(supremeLabel); 
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submit)
		{
			repaint();
		}
		if(label.isVisible() && label3.isVisible() && label5.isVisible())
		{	
			xWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(xWon);
		}
		else if(label2.isVisible() && label4.isVisible() && label6.isVisible())
		{
			oWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(oWon);
		}
		else if(label.isVisible() && label7.isVisible() && label9.isVisible())
		{
			xWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(xWon);
		}
		else if(label2.isVisible() && label8.isVisible() && label10.isVisible())
		{
			oWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(oWon);
		}
		else if(label.isVisible() && label13.isVisible() && label17.isVisible())
		{
			xWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(xWon);
		}
		else if(label2.isVisible() && label14.isVisible() && label18.isVisible())
		{
			oWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(oWon);
		}
		else if(label5.isVisible() && label17.isVisible() && label9.isVisible())
		{
			xWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(xWon);
		}
		else if(label6.isVisible() && label18.isVisible() && label10.isVisible())
		{
			oWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(oWon);
		}
		else if(label7.isVisible() && label15.isVisible() && label17.isVisible())
		{
			xWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(xWon);
		}
		else if(label8.isVisible() && label16.isVisible() && label18.isVisible())
		{
			oWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(oWon);
		}
		// button 5, 6, 7
		else if(label9.isVisible() && label11.isVisible() && label13.isVisible())
		{
			xWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(xWon);
		}
		else if(label10.isVisible() && label12.isVisible() && label14.isVisible())
		{
			oWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(oWon);
		}
		// 3, 9,6 
		else if(label3.isVisible() && label17.isVisible() && label11.isVisible())
		{
			xWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(xWon);
		}
		else if(label4.isVisible() && label18.isVisible() && label12.isVisible())
		{
			oWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(oWon);
		}
		// 3, 7, 8
		else if(label5.isVisible() && label13.isVisible() && label15.isVisible())
		{
			xWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(xWon);
		}
		else if(label6.isVisible() && label14.isVisible() && label16.isVisible())
		{
			oWon.setBounds(1300, button9.getY(), 500, 50);
			this.add(oWon);
		}
		else
		{
			if(!button.isVisible() && !button2.isVisible() && !button3.isVisible() && !button4.isVisible() && !button5.isVisible() && !button6.isVisible() && !button7.isVisible() && !button8.isVisible())
			{
				tie.setBounds(1300, button9.getY(), 500, 50);
				this.add(tie);
			}
		}
		if(e.getSource() == button)
		{
			button.setVisible(false);
			if(turn == 1)
			{
				label.setBounds(button.getX(), button.getY(), 250, 250);
				this.add(label);
//				supremeLabel.add(label);
				label.setVisible(true);
				turn++;
			}
			else
			{
				label2.setBounds(button.getX(), button.getY(), 250, 250);
				this.add(label2);
//				supremeLabel.add(label2);
				label2.setVisible(true);
				turn = 1;
			}
		}
		if(e.getSource() == button2)
		{
			button2.setVisible(false);
			if(turn == 1)
			{
				label3.setBounds(button2.getX(), button2.getY(), 495, 250);
				this.add(label3);
//				supremeLabel.add(label3);
				label3.setVisible(true);
				turn++;
			}
			else
			{
				label4.setBounds(button2.getX(), button2.getY(), 495, 250);
	        	this.add(label4);
//				supremeLabel.add(label4);
				label4.setVisible(true);
				turn = 1;
			}
		}
		if(e.getSource() == button3)
		{
			button3.setVisible(false);
			if(turn == 1)
			{
				label5.setBounds(button3.getX(), button3.getY(), 250, 250);
				this.add(label5);
//				supremeLabel.add(label5);
				label5.setVisible(true);
				turn++;
			}
			else
			{
				label6.setBounds(button3.getX(), button3.getY(), 250, 250);
				this.add(label6);
//				supremeLabel.add(label6);
				label6.setVisible(true);
				turn = 1;
			}
		}
		if(e.getSource() == button4)
		{
			button4.setVisible(false);
			if(turn == 1)
			{
				label7.setBounds(button4.getX(), button4.getY(), 250, 495);
				this.add(label7);
//				supremeLabel.add(label7);
				label7.setVisible(true);
				turn++;
				System.out.println("hiu");
			}
			else
			{
				label8.setBounds(button4.getX(), button4.getY(), 250, 495);
				this.add(label8);
//				supremeLabel.add(label8);
				label8.setVisible(true);
				turn = 1;
			}
		}
		if(e.getSource() == button5)
		{
			button5.setVisible(false);
			if(turn == 1)
			{
				label9.setBounds(button5.getX(), button5.getY(), 250, 250);
				this.add(label9);
//				supremeLabel.add(label9);
				label9.setVisible(true);
				turn++;
			}
			else
			{
				label10.setBounds(button5.getX(), button5.getY(), 250, 250);
				this.add(label10);
//				supremeLabel.add(label10);
				label10.setVisible(true);
				turn = 1;
			}
		}
		if(e.getSource() == button6)
		{
			button6.setVisible(false);
			if(turn == 1)
			{
				label11.setBounds(button6.getX(), button6.getY(), 495, 250);
				this.add(label11);
//				supremeLabel.add(label11);
				label11.setVisible(true);
				turn++;
			}
			else
			{
				label12.setBounds(button6.getX(), button6.getY(), 495, 250);
				this.add(label12);
//				supremeLabel.add(label12);
				label12.setVisible(true);
				turn = 1;
			}
		}
		if(e.getSource() == button7)
		{
			button7.setVisible(false);
			if(turn == 1)
			{
				label13.setBounds(button7.getX(), button7.getY(), 495, 250);
				this.add(label13);
//				supremeLabel.add(label13);
				label13.setVisible(true);
				turn++;
			}
			else
			{
				label14.setBounds(button7.getX(), button7.getY(), 495, 250);
				this.add(label14);
//				supremeLabel.add(label14);
				label14.setVisible(true);
				turn = 1;
			}
		}
		if(e.getSource() == button8)
		{
			button8.setVisible(false);
			if(turn == 1)
			{
				label15.setBounds(button8.getX(), button8.getY(), 495, 250);
				this.add(label15);
//			    supremeLabel.add(label15);
				label15.setVisible(true);
				turn++;
				System.out.println("hiu");
			}
			else
			{
				label16.setBounds(button8.getX(), button8.getY(), 495, 250);
				this.add(label16);
//				supremeLabel.add(label16);
				label16.setVisible(true);
				turn = 1;
			}
		}
		if(e.getSource() == button9)
		{
			button9.setVisible(false);
			if(turn == 1)
			{
				label17.setBounds(button9.getX(), button9.getY(), 495, 250);
				this.add(label17);
				label17.setVisible(true);
//				supremeLabel.add(label17);
				turn++;
				System.out.println("hiu");
			}
			else
			{
				label18.setBounds(button9.getX(), button9.getY(), 495, 250);
				this.add(label18);
				label18.setVisible(true);
//				supremeLabel.add(label18);
				turn = 1;
			}
		}
	}
}
