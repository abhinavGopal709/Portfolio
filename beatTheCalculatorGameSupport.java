import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class beatTheCalculatorGameSupport extends JFrame implements ActionListener {
	JLabel label = new JLabel("In this game there will be a timer which will be set to 60 seconds");
	JLabel label2 = new JLabel("You need to answer before the time runs out !");
	JLabel label3 = new JLabel("Good Luck");
	JButton button = new JButton("Click Here to Begin !");
	beatTheCalculatorGameSupport() {
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(500, 500));
		button.addActionListener(this);
		this.add(label);
		this.add(label2);
		this.add(label3);
		this.add(button);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			beatTheCalculatorGame calculatorGame = new beatTheCalculatorGame();
		}
		
	}
}
