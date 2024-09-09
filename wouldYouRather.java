import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class wouldYouRather extends JFrame implements ActionListener{
	boolean submitButtonLogic = false;
	ImageIcon image1 = new ImageIcon(getClass().getResource("iceCreamImage.png")); 
	ImageIcon image2 = new ImageIcon(getClass().getResource("birthdayCake.png")); 
	ImageIcon image3 = new ImageIcon(getClass().getResource("flipPhoneIcon.png")); 
	ImageIcon image4 = new ImageIcon(getClass().getResource("desktopIcon.png")); 
	ImageIcon image5 = new ImageIcon(getClass().getResource("olderBrotherIcon.jpg"));
	JTextField wouldYouRatherAnswer = new JTextField();
	JLabel label = new JLabel();
	JLabel subLabel1 = new JLabel();
	JLabel subLabel2 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton submitButton = new JButton();
	JButton submitButton2 = new JButton();
	JButton submitButton3 = new JButton();
	int feedback;
	String feedback2;
	String feedback3;
	wouldYouRather() {
		
		wouldYouRatherAnswer.setBounds(100, 150, 250, 40);
		wouldYouRatherAnswer.setText("ANSWER");
		
		submitButton.setBounds(100, 170, 200, 40);
		submitButton.setText("sumbit");
		
		label.setIcon(image1);
		label.setText("Would you rather eat a gallon of Icecream or eat a whole birthday cake ?");
		label.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setForeground(new Color(0, 50, 150));
		
		subLabel1.setIcon(image2);
		subLabel1.setSize(image2.getIconHeight() - 200, image2.getIconWidth() - 200);
		
		subLabel2.setIcon(image4);
		
		
		submitButton.addActionListener(this);
		submitButton2.addActionListener(this);
		submitButton3.addActionListener(this);
		this.add(subLabel1);
		this.add(label);
		this.add(submitButton);
		this.add(wouldYouRatherAnswer);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(900, 700));
		this.getContentPane().setBackground(new Color(0, 100, 255));
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.pack();
		// use the textfield as well as the submit button in order to display different would you rather questions 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submitButton && submitButtonLogic == false) {
				this.remove(subLabel1);
				this.remove(submitButton);
				this.remove(label);
				System.out.println(wouldYouRatherAnswer.getText() + " ? " +" That is an interesting choice !");
				wouldYouRatherAnswer.setBounds(300, 150, 450, 40);
				wouldYouRatherAnswer.setText("ANSWER");
				label2.setBounds(100, 350, 350, 200);
				subLabel2.setSize(image4.getIconHeight() - 200, image4.getIconWidth() - 200);
				label2.setSize(image3.getIconHeight() - 200, image3.getIconWidth() - 200);
				label2.setIcon(image3);
				label2.setText("Would you Rather carry a flip phone or only use a desktop computer?");
				label2.setFont(new Font("MV Boli", Font.PLAIN, 15));
				this.add(wouldYouRatherAnswer);
				this.add(label2);
				this.add(submitButton2);
				this.add(subLabel2);
				this.setLayout(new FlowLayout());
				this.setSize(new Dimension(500, 500));
				submitButton2.setText("sumbit");
				submitButtonLogic = true;
				this.getContentPane().setBackground(new Color(150, 50, 0));
				this.pack();
			}
			if(e.getSource()== submitButton2 && submitButtonLogic == true) {
				subLabel2.setVisible(false);
				System.out.println("Hmmm... " + wouldYouRatherAnswer.getText() + " is an interesting answer");
				submitButton2.setVisible(false);
				label2.setVisible(false);
				label3.setBounds(100, 350, 350, 200);
				label3.setIcon(image5);
				label3.setText("Would you rather be the oldest child or the youngest child ?");
				label3.setFont(new Font("Comic Sans", Font.PLAIN, 15));
				submitButton3.setText("sumbit");
				this.add(label3);
				this.add(submitButton3);
				wouldYouRatherAnswer.setBounds(100, 150, 450, 40);
				wouldYouRatherAnswer.setText("ANSWER");
				this.add(wouldYouRatherAnswer);
				this.getContentPane().setBackground(new Color(50, 100, 75));
				this.setSize(new Dimension(1000, 700));
			}
			if(e.getSource() == submitButton3) {
				Scanner console = new Scanner(System.in);
				System.out.println("Thank You for Playing ! " + videoGameQuadIntro.textField.getText());
				System.out.println("How did you like the would you rather game on a scale of 1 - 10");
				feedback = console.nextInt();
				if(feedback <= 5) {
					System.out.println("What can I do to improve your experience ?");
					feedback3 = console.nextLine();
				}
				if(feedback <= 5) {
					System.out.println(feedback + "" + feedback3);
				}
				else
				{
					System.out.println(feedback);
				}
			}
		
	}

}