import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class headsUpSupport extends JFrame implements ActionListener {
	JLabel label = new JLabel("You most move your character left to right avoiding the incoming projectiles from above");
	JButton button = new JButton("NOTE: Use the A and D keys on your keyboard to move your character. Click here to begin !");
	headsUpSupport() {
		this.add(label);
		button.addActionListener(this);
		this.add(button);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(700, 200));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			headsUp headsUpMain = new headsUp();
		}
	}

}
