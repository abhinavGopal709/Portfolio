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

public class fifthSongGuessr extends JFrame implements ActionListener {
	JLabel label = new JLabel("Welcome to Guess the Song! You may guess the song in the text box - > ");
	JTextField textField = new JTextField("Enter your answer here as: Song Name - Author Name ");
	ImageIcon image = new ImageIcon(getClass().getResource("musicPic5.png"));
	JButton button = new JButton("submit");
	String correctAnswer5 = "I Ain't Worried - OneRepublic";
	Clip clip;
	public fifthSongGuessr() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("iAintWorried-oneRupublic.wav");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		button.addActionListener(this);
		label.setIcon(image);
		this.add(label);
		this.add(textField);
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
			if(textField.getText().equals(correctAnswer5))
			{
				label.setText("Bingo ! You got it !");
				clip.stop();
			}
			else
			{
				System.out.println("Try Again !");
			}
		}
		
	}
}
