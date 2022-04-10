package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		
		ImageIcon icon = new ImageIcon("bakgrunn3.png");
		ImageIcon icon2 = new ImageIcon("whoasked.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(120, 100, 250, 100);
		button.addActionListener(this);
		button.setText("Button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.LEFT);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.PLAIN, 25));
		button.setForeground(Color.red);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		add(button);
		add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {
			System.out.println("Clicked");
			button.setEnabled(false);
			label.setVisible(true);
		}
		
	}
	
}
