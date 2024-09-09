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

public class seventhSongGuessr extends JFrame implements ActionListener {
	JLabel label = new JLabel("Ready to Play Guess the Song ? Enter as Song Name - Author Name");
	JTextField textField = new JTextField("Enter you answer here !");
	JButton button = new JButton("Submit");
	String correctAnswer7 = "Sunroof - Nick Youre";
	ImageIcon image = new ImageIcon(getClass().getResource("musicPic7.png"));
	Clip clip;
	public seventhSongGuessr() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("sunroof-nickYoure.wav");
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
		if(e.getSource() == button)
		{
			if(textField.getText().equals(correctAnswer7))
			{
				label.setText("You got it !");
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
