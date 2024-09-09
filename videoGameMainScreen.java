
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class videoGameMainScreen extends videoGameQuadIntro implements ActionListener {
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Tic Tac Toe");
	JButton button2 = new JButton("Guess the Song");
	JButton button3 = new JButton("Flip A Coin");
	JButton button4 = new JButton("Would you rather");
	JButton button5 = new JButton("Zombie Attack !");
	JButton button6 = new JButton("Beat the calculator !");
	JButton button7 = new JButton("Heads Up !");
	JButton button8 = new JButton("Speed Clickr !");
	JLabel label0 = new JLabel("Welcome " + textField.getText() + "!");
	JLabel label = new JLabel("Hello! Click one of ");
	JLabel label2 = new JLabel("the Buttons");
	JLabel label3 = new JLabel("to play :");
	videoGameMainScreen() {
		label0.setLocation(0, 0);
		
		label.setFont(new Font ("Comic Sans", Font.PLAIN, 30));
		
		label.setFont(new Font ("Comic Sans", Font.PLAIN, 30));
		
		label2.setFont(new Font ("Comic Sans", Font.PLAIN, 30));
		
		label3.setFont(new Font ("Comic Sans", Font.PLAIN, 30));
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		
		frame.add(label);
		frame.add(label2);
		frame.add(label3);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(label0);
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(840, 700));
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "Tic Tac Toe" :
				ticTacToe tTT = new ticTacToe();
				break;
			case "Guess the Song" :
				songGuesrSupport broadcast  = new songGuesrSupport();
				broadcast.guessTheSongBroadcast();
				break;
			case "Flip A Coin" :
				flipACoin fAC = new flipACoin();
				fAC.flipACoinGame();
				break;
			case "Would you rather" :
				wouldYouRatherHost wYRH = new wouldYouRatherHost();
				break;
			case "Zombie Attack !" :
				zombieAttackSupport zAS = new zombieAttackSupport();
				break;
			case "Beat the calculator !" :
				beatTheCalculatorGameSupport beatTheCalcuatorSupport = new beatTheCalculatorGameSupport();
				break;
			case "Heads Up !" :
				headsUpSupport headsUpSupport = new headsUpSupport();
				break;
			case "Speed Clickr !" :
				speedClickrSupport supportClass = new speedClickrSupport();
				break;
		}
	}
}
