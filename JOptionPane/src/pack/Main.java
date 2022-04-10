package pack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	//	JOptionPane.showMessageDialog(null, "Testing box", "a title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Testing box", "a title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Testing box", "a title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Testing box", "a title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Testing box", "a title", JOptionPane.ERROR_MESSAGE);

//		System.out.println(JOptionPane.showConfirmDialog(null, "This is a question", "Title", JOptionPane.YES_NO_CANCEL_OPTION)); // returns a number
		
//		String name = JOptionPane.showInputDialog("What is your name");
//		System.out.println("Hello " + name);
		
		
		String[] responses = {"No, you are awesome", "Thank you", "Huh"};
		ImageIcon icon = new ImageIcon("Season4_icon.png");
		JOptionPane.showOptionDialog(null, 
				"You are awesome", 
				"Secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0);
		
	}

}
