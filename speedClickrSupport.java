import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class speedClickrSupport extends JFrame implements ActionListener {
	JLabel label = new JLabel("In this game you must click the button as many times as you can in 1 minutes");
	JButton button = new JButton("Click Here to Begin !");
	speedClickrSupport() {
		this.add(label);
		button.addActionListener(this);
		this.add(button);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			speedClickr clickingGame = new speedClickr();
		}
		
	}
}
