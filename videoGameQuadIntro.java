import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class videoGameQuadIntro implements ActionListener {
	static JTextField textField = new JTextField("UserName");
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button1 = new JButton("Submit");
	JLabel label = new JLabel("Welcome to Video Game Quad !");
	String userName = "";
	videoGameQuadIntro() {
		
		label.setBounds(25, -25, 500, 500);
		label.setFont(new Font("MV Boli", Font.PLAIN, 30));
		
		button.setBounds(100, 260,  200, 40);
		button.setText("Please click here to start");
		button.addActionListener(this);
		
		frame.add(label);
		frame.add(button);
		textField.setBounds(100, 150, 200, 40);
		
		button1.setBounds(100, 170, 200, 40);
		button1.setVisible(true);
		frame.add(textField);
		button1.addActionListener(this);
		frame.add(button1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.getContentPane().setBackground(new Color(0, 210, 255));
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
			case "Please click here to start" :
				frame.dispose();
				videoGameMainScreen vGMS = new videoGameMainScreen();
				break;
			case "Submit" :
				userName = textField.getText();
				button1.setEnabled(false);
				break;
			}
		
	}
}
