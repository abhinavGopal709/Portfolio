import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class thirdSongGuessr extends JFrame implements ActionListener {
	String correctAnswer3 = "Rude - Magic";
	JLabel label = new JLabel("Lets test those skills of yours ! Note: Enter your answer as Song Name - Author Name");
	JButton button = new JButton("submit");
	ImageIcon music = new ImageIcon(getClass().getResource("musicPic3.png"));
	JTextField textField = new JTextField("Enter your answer here");
	Clip clip;
	public thirdSongGuessr() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("rude-Magic.wav");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		this.add(label);
		label.setIcon(music);
		this.add(textField);
		button.addActionListener(this);
		this.add(button);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			if(textField.getText().equals(correctAnswer3))
			{
				label.setText("You got it ! " + " Well done !");
				clip.stop();
			}
			else
			{
				System.out.println("Try Again !");
				clip.setMicrosecondPosition(0);
			}
		}
		
	}
}
