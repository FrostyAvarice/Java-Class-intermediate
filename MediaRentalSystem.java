import java.io.File;
import java.io.FileNotFoundException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;


public class MediaRentalSystem implements ActionListener{
	
	
	private static Manager mgt;
	private JFrame window; 
	private JFrame textWindow;
	private JButton button1;
	private JButton button2; 
	private JButton button3;
	private JMenuBar jmenuBar;
	private JMenu fileMenu;
	private JMenuItem loadDirectory;
	private String inputDirectory;
	private JFileChooser fc;
	private JTextArea jtext;
	private JScrollPane scroll;
	
	
	Font msNewGothic = new Font("MS Gothic", Font.ITALIC, 12);
	
	public MediaRentalSystem() {
		// create buttons
		
		
		button1 = new JButton("Look Up by Title");
		button2 = new JButton("Rent media by ID");
		
		button1.setVisible(false);
		button2.setVisible(false);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		//button1.setBackground(new Color(0, 102, 102));
		//button2.setBackground(new Color(0, 128, 255));
		window = new JFrame("M.R.S.");
		window.setLayout(new BorderLayout());
		window.setFont(msNewGothic);
		jmenuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		loadDirectory = new JMenuItem("Load Directory");
		fileMenu.add(loadDirectory);
		jmenuBar.add(fileMenu);
		jmenuBar.setVisible(true);
		loadDirectory.addActionListener(this);
		window.setJMenuBar(jmenuBar);
		window.setSize(300,300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
		
		textWindow = new JFrame("Output for buttons");
		textWindow.setLayout(new FlowLayout());
		textWindow.setSize(650,500);
		textWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textWindow.setLocation(700, 250);
		textWindow.setVisible(true);
		
		
		jtext = new JTextArea();
		jtext.setPreferredSize(new Dimension(550,550));
        textWindow.add(jtext);
        
		
		window.add(button1, BorderLayout.WEST);
		window.add(button2, BorderLayout.LINE_END);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		
		
		EBook ebook1 = new EBook(1234, "I am an ebook",2018,30);
		MusicCD musicCD = new MusicCD(1235," Jammin",2000,5);
		MovieDVD movieDVD = new MovieDVD(1236, "I am a movie",1996,2);
		Manager mgt1 = new Manager();
		
		mgt1.addMedia(ebook1);
		mgt1.addMedia(musicCD);
		mgt1.addMedia(movieDVD);
		
		try {
		
		mgt1.createMediaFiles("C:/Users/Devin/Documents/Java Programs/CMIS 242/FinalProjectTest");
		
			
		} catch (IOException e) {
			
		}
		
		MediaRentalSystem mrs = new MediaRentalSystem();
		
				
		
		
	}
	public void actionPerformed(ActionEvent e) {
		File directory = null;
		if (e.getSource() == loadDirectory) {
			fc = new JFileChooser();
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int selection = fc.showOpenDialog(null);
			if (selection == JFileChooser.APPROVE_OPTION) {
				directory = fc.getSelectedFile();
				String fullPath = directory.getPath();
				button1.setVisible(true);
				button2.setVisible(true);
			}
		} else if (e.getSource() == button1) {
			directory = fc.getSelectedFile();
			String fullPath = directory.getPath();
			try {
				
				mgt = new Manager(fullPath);
				mgt.displayAllMedia();
				String userInput = JOptionPane.showInputDialog("Please provide the media type you wish to look up");
				jtext.setText(mgt.displaySpecificMedia(userInput));
				//JOptionPane.showMessageDialog(window, mgt.displaySpecificMedia(userInput));
				
			} catch (FileNotFoundException x) {
				
			}
		} else if (e.getSource() == button2) {
			directory = fc.getSelectedFile();
			String fullPath = directory.getPath();
			System.out.println(fullPath);
			try {
				mgt = new Manager(fullPath);
				int ID = Integer.parseInt(JOptionPane.showInputDialog("Please provide ID"));
				jtext.setText(mgt.rentMedia(ID));
			} catch (FileNotFoundException y) {
				
			}
		}
	}
	
	//C:/Users/Devin/Documents/Java Programs/CMIS 242/FinalProjectTest
	
	
		
	
}
