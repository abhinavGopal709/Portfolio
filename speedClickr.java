import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class speedClickr extends JFrame implements ActionListener {
	JLabel label = new JLabel("Game Over!");
	JLabel label2 = new JLabel("Game Over!");
	JLabel label3 = new JLabel("Game Over!");
	JButton button = new JButton("Click Me !");
	int points = 0;
	Timer timer;
	int count;
	speedClickr() 
	{
		timer = new Timer(10000, this);
		timer.start();
		button.addActionListener(this);
		this.add(button);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(300,200));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			points++;
			count++;
		}
		else
		{
			timer.stop();
			button.setEnabled(false);
			label.setText("You got " + points + " points !");
			this.add(label);
			if(points > 0 && points < 6)
			{
				label2.setText("Your rank is Bronze I");
			}
			if(points >= 6 && points < 20)
			{
				label2.setText("Your rank is Bronze II");
			}
			if(points >= 20 && points < 50)
			{
				label2.setText("Your rank is Silver I");
			}
			if(points >= 50 && points < 100)
			{
				label.setText("Your rank is Silver II");
			}
			if(points >= 100 && points < 180)
			{
				label.setText("Your rank is Gold I");
			}
			if(points >= 180 && points < 220)
			{
				label.setText("Your rank is Gold II");
			}
			if(points >= 220 && points < 250)
			{
				label.setText("Your rank is GodSpeed I");
			}
			if(points >= 250 && points < 300)
			{
				label.setText("Your rank is GodSpeed II");
			}
			double average = 60/count;
			label3.setText("Your speed was " + average + " click(s) per a second!");
			this.add(label2);
			this.add(label3);
			
		}
		
	}
}
