package start;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		/*
		JFrame frame = new JFrame(); // creates frame
		
		frame.setTitle("My first frame"); // sets title of frame
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application, only hides by default
		
		frame.setResizable(false); // can`t change frame size
		
		frame.setSize(420, 420); // sets x and y dimension
		
		frame.setVisible(true); // makes frame visible
		
		ImageIcon image = new ImageIcon("Season4_icon.png");
		
		frame.setIconImage(image.getImage());
		
//		frame.getContentPane().setBackground(Color.red); // change color of background, uses set colors
		frame.getContentPane().setBackground(new Color(103, 180, 100)); // change color, uses rgb
		*/
		
		MyFrame frame = new MyFrame();
	}

}
