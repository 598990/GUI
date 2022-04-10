package pack;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	private JButton button;
	private JCheckBox check;
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		// can be set to imageicons
		check = new JCheckBox();
		check.setText("I`m not a robot");
		check.setFocusable(false);
		check.setFont(new Font("Consolas", Font.PLAIN, 25));
		
		add(button);
		add(check);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == button) {
			System.out.println(check.isSelected());
		}

	}

}
