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

public class eigthSongGuessr extends JFrame implements ActionListener {
	JLabel label = new JLabel("Time to play... Guess The Song ! Answer must be in format: Song Name - Author Name");
	ImageIcon image = new ImageIcon(getClass().getResource("musicPic8.jpg"));
	JButton button = new JButton("submit");
	JTextField textField = new JTextField("Enter your answer here");
	String correctAnswer8 = "Insane - Gryphon and Bassik";
	Clip clip;
	public eigthSongGuessr() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("insane-blackGryphon&Bassik.wav");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		label.setIcon(image);
		this.add(label);
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
		if(e.getSource() == button) {
			if(textField.getText().equals(correctAnswer8))
			{
				label.setText("You're a genius !");
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
