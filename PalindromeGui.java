import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PalindromeGui extends JFrame {

	// Create new JPanel object
	private final JPanel panel = new JPanel();

	public PalindromeGui() {

		// Assigning names to swing components
		JLabel inputLabel, outputLabel, outputLabel2;
		JTextField userInput, programOutput, programOutput2;
		JButton pButton, pButton2;

		// Create label to display text
		inputLabel = new JLabel("Enter a word");
		outputLabel = new JLabel("Is your word a palindrome?");
		outputLabel2 = new JLabel("Even or Odd?");

		// Create a text field
		userInput = new JTextField(15);
		programOutput = new JTextField(17);
		programOutput.setEditable(false);
		
		programOutput2 = new JTextField(15);
		programOutput2.setEditable((false));
		

		// Create a button
		pButton = new JButton("Palindrome?");
		pButton2 = new JButton("Even number of letters?");

		// Set layout. Add label, text field, button, and panel
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().add(inputLabel);
		getContentPane().add(userInput);
		getContentPane().add(outputLabel);
		getContentPane().add(panel);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		getContentPane().add(programOutput);
		getContentPane().add(outputLabel2);
		getContentPane().add(programOutput2);
		getContentPane().add(pButton);
		getContentPane().add(pButton2);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

		// Listener for button clicks
		pButton.addActionListener(new ActionListener() {

			// Action to be performed when button is pressed
			@Override
			public void actionPerformed(ActionEvent e) {
				String backwardString = "";
				String userText = userInput.getText();
				int letters = userText.length();
				for (int i = letters - 1; i >= 0; i--) {
					backwardString += userText.charAt(i);
				}

				if (backwardString.equalsIgnoreCase(userText)) {
					programOutput.setText("Your word is a palindrome!");
				} else {
					programOutput.setText("Your word is not a palindrome.");
				}

			}
		});
		pButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userText = userInput.getText();
				int length = userText.length();
				if (length % 2 == 0) {
					programOutput2.setText("even number of letters");
				} else {
					programOutput2.setText("odd number of letters");
				}
			}
		});

	}

	public static void main(String[] args) {

		PalindromeGui obj = new PalindromeGui();
		obj.setVisible(true); // Displays frame
		obj.setSize(400, 200); // Set size of frame
	}
}
