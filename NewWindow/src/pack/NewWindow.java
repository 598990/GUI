package pack;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	private JFrame frame = new JFrame();
	private JLabel label = new JLabel("The new window");

	public NewWindow() {
		
		label.setBounds(0, 0, 300, 50);
		label.setFont(new Font("Helvetica", Font.PLAIN, 25));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.add(label);
		frame.setVisible(true);
		
	}
	
}
