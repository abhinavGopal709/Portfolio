import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class wouldYouRatherSupport extends JFrame implements ActionListener {
	JButton button = new JButton("Click here to start !");
	JLabel label = new JLabel();
	wouldYouRatherSupport() {
		this.setLayout(null);
		this.setSize(new Dimension(500, 500));
		this.add(button);
		button.setBounds(100, 150, 300, 100);
		button.addActionListener(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "Click here to start !" :
			this.dispose();
			wouldYouRather wYR = new wouldYouRather();
			break;
		}
		
	}

}
