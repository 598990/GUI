package start;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {

		this.setTitle("My first this"); // sets title of frame

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application, only hides by default

		this.setResizable(false); // can`t change frame size

		this.setSize(420, 420); // sets x and y dimension

		this.setVisible(true); // makes frame visible

		ImageIcon image = new ImageIcon("Season4_icon.png");

		this.setIconImage(image.getImage());

//		this.getContentPane().setBackground(Color.red); // change color of background, uses set colors
		this.getContentPane().setBackground(new Color(103, 180, 100)); // change color, uses rgb
	}

}
