package pack;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameAlt extends JFrame {

private JButton button;
	
	public MyFrameAlt() {
		
		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(e -> System.out.println("Clicked"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		add(button);
		
	}
	
}
