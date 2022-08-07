import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Manager {

	//attribute 
	private ArrayList<Media> media;
	private String directory;
	
	//constructor
	public Manager() {
		
		media = new ArrayList<Media>();
	}
	
	public Manager(String directory) throws FileNotFoundException {
		//
		media = new ArrayList<Media>();
		this.directory = directory;
		
		//create the file to house directory
		File directoryPath = new File(directory);
		
		//get list of files and directories
		File fileslist[] = directoryPath.listFiles();
		
		if (fileslist == null)
			throw new FileNotFoundException("Could not find item");
		
		//local  variable 
		Media media = null;
		String line = null;
		Scanner scan = null; 
		
		//Process each file
		for (File file : fileslist) {
			
			//open and read line, assuming whole object is stored on single line
			scan = new Scanner(file);
			line = scan.nextLine();
			
			//look for files that are EBook's
			 if (file.getName().contains("EBook"))
				 media = new EBook(line);
			 
			 // look for files that are Movies
			 if (file.getName().contains("MovieDVD"))
				 media = new MovieDVD(line);
			 
			 //look for files that are Music CD's
			 if (file.getName().contains("MusicCD"))
				 media = new MusicCD(line);
			 
				//add to list
			this.media.add(media);
			media.setFilename(line);
			
			//overwrites or creates a file for each media object in the media attribute 
			
		}
			
	}
	public String getDirectory() {
		return this.directory;
	}

	public void createMediaFiles(String directory) throws IOException {
		
		PrintWriter out = null; 
		
		//for all Media objects, creates files using Media type and id value for a filename
		
		for (int i=0; i < media.size(); i++) {
			String filename = directory + "/" + media.get(i).getClass().getSimpleName() + "-" + media.get(i).getId() + ".txt";
			
			media.get(i).setFilename(filename);
			
			out = new PrintWriter(new FileWriter(filename));
			//create or overwrite the file
			
			out.println(media.get(i).toString());
			out.flush();
			out.close();
			
		}
	}
	
	private void updateIndividualFiles(String directory) throws IOException {
		PrintWriter out = null;
		
		for (int i=0; i < media.size(); i++) {
			String filename = directory + "/" + media.get(i).getClass().getSimpleName() + "-" + media.get(i).getId() + ".txt";	
			out = new PrintWriter(new FileWriter(filename));
					
			out.println(media.get(i).toString());
			out.flush();
			out.close();
		}
		
	}
			
	public String displaySpecificMedia(String mediaType) {
		System.out.println(mediaType);
		String output = "";
		for (int i = 0; i < media.size(); i++) {
			if (media.get(i).getTitle().contains(mediaType))
				output += media.get(i).cleanPrint();
		}
		if (output.isEmpty()) {
			output = "Item not found";
			return output;
		} else {
		return output;
		}
	}
	public String rentMedia(int userInput) {
		String output = null;
		for (int i=0; i < this.media.size(); i++) {
			if (userInput == media.get(i).getId()) {
				if (media.get(i).getAvailability() == false) {
					output = "Already Rented";
					return output;
				} else {
					media.get(i).setAvailability(false);
					
					try {
						updateIndividualFiles(getDirectory());
						
					} catch (IOException e) {
						
					}
					output = media.get(i).cleanPrint() + "\n\n\n MEDIA RENTAL SUCCESS";
				}
			}	
		}
		return output;
		
	}
	public void displayAllMedia() {
		//for all media objects, display their data
		for (int i=0; i < media.size(); i++) {
			System.out.println(media.get(i).toString());
		}
	}
	
	public void addMedia( Media media) {
		this.media.add(media);
	}
	
}
