import java.awt.*;

import javax.swing.*;


public class FirstGUI {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.CYAN));
		
		JLabel label = new JLabel("My label");
		JLabel label2 = new JLabel("Second label");
		JCheckBox checkbox1 = new JCheckBox("Checkbox");
		
		content.add(label, BorderLayout.PAGE_START);
		content.add(label2, BorderLayout.PAGE_END);
		content.add(checkbox1, BorderLayout.EAST);
		
		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(300,300);
		window.setLocation(550, 250);
		window.setVisible(true);
		
	}

}
