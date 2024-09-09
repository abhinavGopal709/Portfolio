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

public class firstSongGuessr extends JFrame implements ActionListener {
	String correctAnswer = "My Way - Calvin Harris";
	ImageIcon music = new ImageIcon(getClass().getResource("Music.png"));
	JLabel label = new JLabel("Guess the song by entering you answer in the text box below ! Use the format Song Name - Author Name");
	JButton submitButton = new JButton("submit");
	JTextField textField = new JTextField("Enter Answer Here");
	Clip clip;
	public firstSongGuessr() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		submitButton.addActionListener(this);
		File file = new File("myWay-CalvinHarris.wav");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		label.setIcon(music);
		this.add(label);
		this.add(submitButton);
		this.add(textField);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(700, 500));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submitButton) {	
			if(textField.getText().equals("My Way - Calvin Harris")) {
				label.setText("Well Done! You Guessed it !");
				clip.stop();
				}
			else {
				System.out.println("Hmmmm.... try again");
				clip.setMicrosecondPosition(0);
			}
			
		}
	}
}
