package pack;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	private JRadioButton pizza;
	private JRadioButton hamburger;
	private JRadioButton hotdog;
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
         
        // can use imageicons
        pizza = new JRadioButton("Pizza");
        hamburger = new JRadioButton("Hamburger");
        hotdog = new JRadioButton("Hot-dog");
        
        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(hamburger);
        group.add(hotdog);
        
        pizza.addActionListener(this);
        hamburger.addActionListener(this);
        hotdog.addActionListener(this);
        
        add(pizza);
        add(hamburger);
        add(hotdog);
        pack();
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == pizza) {
			System.out.println("You ordered pizza");
		}
		else if(e.getSource() == hamburger) {
			System.out.println("You ordered hamburger");
		}
		else if(e.getSource() == hotdog) {
			System.out.println("You ordered hot-dog");
		}
		
	}
	
}
