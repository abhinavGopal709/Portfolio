import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class songGuesrSupport extends JFrame implements ActionListener {
	JButton button = new JButton("Click Here to Start !");
	public void guessTheSongBroadcast() {
		this.setLayout(null);
		this.setSize(new Dimension(500, 500));
		button.setBounds(100, 200, 200, 200);
		button.addActionListener(this);
		this.add(button);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			guessTheSong gTS = new guessTheSong();
			try {
				gTS.songGuessr();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}
