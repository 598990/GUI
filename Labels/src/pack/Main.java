package pack;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("Season4_icon.png");
		Border b = BorderFactory.createLineBorder(Color.black, 15);
		
		
		JLabel label = new JLabel(); // can have a string as parameter, instead of setText
		
		label.setText("Testing out labels"); // set text of label
		
		label.setIcon(image);
		
		label.setHorizontalTextPosition(JLabel.CENTER); // position of text
		
		label.setVerticalTextPosition(JLabel.TOP); // position of text
		
		label.setForeground(Color.orange);
		
		label.setFont(new Font("MV Boli", Font.PLAIN, 30));
		
		label.setIconTextGap(70); // how far the image will be away from text
		
		label.setBackground(Color.pink);
		
		label.setOpaque(true);
		
		label.setBorder(b);
		
		label.setVerticalAlignment(JLabel.CENTER); // set position of entire label
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//label.setBounds(0, 0, 550, 600);
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(800, 800);
		
	//	frame.setLayout(null);
		
		frame.setVisible(true);
		
		frame.add(label); // adds the label in the frame
		
		frame.pack(); // resizes based on content, has to be after the content is added
		
		
	}

}
