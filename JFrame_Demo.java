package pk_01;

import java.awt.FlowLayout;
import javax.swing.*;

public class JFrame_Demo {
	public static void main(String [] args) {
		JFrame frame = new JFrame("My First Frame");
		frame.setSize(500, 500);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JTextField textField = new JTextField(20);
		panel.add(textField);
		
		JButton button = new JButton ("Submit");
		panel.add(button);
		
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
}
