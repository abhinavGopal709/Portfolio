import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.io.IOException;
import java.util.*;
public class guessTheSong extends JFrame implements ActionListener{
	JLabel label = new JLabel("Click a button below to start !");
	JButton button = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");
	JButton button5 = new JButton("Button 5");
	JButton button6 = new JButton("Button 6");
	JButton button7 = new JButton("Button 7");
	JButton button8 = new JButton("Button 8");
	public void songGuessr() throws LineUnavailableException,UnsupportedAudioFileException,IOException{
		label.setFont(new Font("Comforta", Font.PLAIN, 15));
		label.setBounds(100, 0, 400, 200);
		this.add(label);
		button.addActionListener(this);
		this.add(button);
		button2.addActionListener(this);
		this.add(button2);
		button3.addActionListener(this);
		this.add(button3);
		button4.addActionListener(this);
		this.add(button4);
		button5.addActionListener(this);
		this.add(button5);
		button6.addActionListener(this);
		this.add(button6);
		button7.addActionListener(this);
		this.add(button7);
		button8.addActionListener(this);
		this.add(button8);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(700, 500));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "Button 1" :
			try {
				firstSongGuessr firstSong = new firstSongGuessr();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Button 2" :
			try {
				secondSongGuessr secondSong = new secondSongGuessr();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Button 3" :
			try {
				thirdSongGuessr thirdSong = new thirdSongGuessr();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Button 4" :
			try {
				fourthSongGuessr fourthSong = new fourthSongGuessr();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Button 5" :
			try {
				fifthSongGuessr fifthSong =  new fifthSongGuessr();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Button 6" :
			try {
				sixthSongGuessr sixthSong = new sixthSongGuessr();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Button 7" :
			try {
				seventhSongGuessr seventhSong = new seventhSongGuessr();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Button 8" :
			 try {
				eigthSongGuessr eigthSong = new eigthSongGuessr();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
}
