package pack;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	private JTextField textField = new JTextField();
	private JButton button = new JButton("Submit");

	public MyFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		textField.setForeground(new Color(100, 180, 100));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("username");
	
		button.addActionListener(this);
		
		add(button);
		add(textField);
		
		// everything has to be added prior to this
		pack();
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {
			System.out.println("Welcome " + textField.getText());
			textField.setEditable(false);
			button.setEnabled(false);
		}

	}

}
