import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class beatTheCalculatorGame extends JFrame implements ActionListener{
	int count = 1;
	JLabel label = new JLabel("Here is your first question: What is 20 + 15 ?");
	JLabel label2 = new JLabel("Here is your second question: What is 30 x 27?");
	JLabel label3 = new JLabel("Here is your third question: What is 324 x 568?");
	JLabel label4 = new JLabel("Here is your fourth question: What is 101 in Binary (Binary is 2^0:1 2^1:0 2^2:1)?");
	JLabel label5 = new JLabel("Here is your fifth question: What is the simplified root of 8 (Answer entered as number root number)?");
	JLabel label6 = new JLabel("Well Done !");
	JLabel label7 = new JLabel();
	
	Timer timer;
	boolean firstQuestion = false;
	String firstQuestionAnswer = "35";
	String secondQuestionAnswer = "810";
	String thirdQuestionAnswer = "184032";
	String fourthQuestionAnswer = "5";
	String fifthQuestionAnswer = "2 root 2";
	JTextField textField = new JTextField("Enter your answer here");
	JButton button = new JButton("submit1");
	JButton button2 = new JButton("submit2");
	JButton button3 = new JButton("submit3");
	JButton button4 = new JButton("submit4");
	JButton button5 = new JButton("submit5");
	beatTheCalculatorGame() {
		timer = new Timer(60000, this);
		timer.start();
		timer.isRunning();
		this.add(label);
		this.add(textField);
		button.addActionListener(this);
		this.add(button);
		this.getContentPane().setBackground(new Color(0,200, 200));
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(textField.getText().equals("Enter your answer here") && count == 1)
		{
			label.setText("Times Up ! The answer was " + firstQuestionAnswer );
			button.setEnabled(false);
			timer.stop();
			
		}
		if(textField.getText().equals("Enter your answer here") && count == 2)
		{
			label.setText("Times Up ! The answer was " + secondQuestionAnswer);
			button2.setEnabled(false);
			timer.stop();
			
		}
		if(textField.getText().equals("Enter your answer here") && count == 3)
		{
			label.setText("Times Up ! The answer was " + thirdQuestionAnswer);
			button3.setEnabled(false);
			timer.stop();
			
		}
		if(textField.getText().equals("Enter your answer here") && count == 4)
		{
			label.setText("Times Up ! The answer was " + fourthQuestionAnswer);
			button4.setEnabled(false);
			timer.stop();
			
		}
		if(textField.getText().equals("Enter your answer here") && count == 5)
		{
			label.setText("Times Up ! The answer was " + fifthQuestionAnswer);
			button5.setEnabled(false);
			timer.stop();
			
		}
		if(button == e.getSource())
		{
			if(textField.getText().equals(firstQuestionAnswer))
			{
				label.setText("You got it !");
				count++;
				label.setVisible(false);
				button.setVisible(false);
				this.remove(textField);
				this.add(label2);
				this.add(textField);
				textField.setText("Enter your answer here");
				button2.addActionListener(this);
				this.add(button2);
			}
		}
		if(button2 == e.getSource())
		{
			if(textField.getText().equals(secondQuestionAnswer))
			{
				this.remove(textField);
				count++;
				label2.setVisible(false);
				button2.setVisible(false);
				this.add(label3);
				this.add(textField);
				textField.setText("Enter your answer here");
				button3.addActionListener(this);
				this.add(button3);
			}
		}
		if(button3 == e.getSource())
		{
			if(textField.getText().equals(thirdQuestionAnswer))
			{
				this.remove(textField);
				count++;
				label3.setVisible(false);
				button3.setVisible(false);
				this.add(label4);
				this.add(textField);
				textField.setText("Enter your answer here");
				button4.addActionListener(this);
				this.add(button4);
			}
		}
		if(button4 == e.getSource())
		{
			if(textField.getText().equals(fourthQuestionAnswer))
			{
				this.remove(textField);
				count++;
				label4.setVisible(false);
				button4.setVisible(false);
				this.add(label5);
				this.add(textField);
				textField.setText("Enter your answer here");
				button5.addActionListener(this);
				this.add(button5);
			}
		}
		if(button5 == e.getSource())
		{
			if(textField.getText().equals(fifthQuestionAnswer))
			{
				this.remove(textField);
				count++;
				label5.setVisible(false);
				button5.setVisible(false);
				this.add(label6);
				label7.setText("You had a streak of " + count);
				this.add(label7);
				
			}
		}
	}
}
