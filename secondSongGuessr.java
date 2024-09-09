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

public class secondSongGuessr extends JFrame implements ActionListener {
	String correctAnswer2 = "Cheerleader - OMI";
	JLabel label = new JLabel("Guess the song ! Use the format Song Name - Author Name");
	ImageIcon music2 = new ImageIcon(getClass().getResource("musicPic2.jpeg"));
	JButton button = new JButton("submit");
	Clip clip;
	JTextField textField = new JTextField("Enter your answer here");
	public secondSongGuessr() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("cheerleader-OMI.wav");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		label.setIcon(music2);
		this.add(label);
		button.addActionListener(this);
		this.add(button);
		this.add(textField);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(1300, 500));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			if(textField.getText().equals(correctAnswer2))
			{
				label.setText("You got it ! " + "The answer is " + textField.getText());
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
