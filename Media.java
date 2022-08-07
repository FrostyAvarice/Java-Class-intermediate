
public abstract class Media {
	// attributes
	private int id;
	private String title;
	private int year; // validate that 4 digits
	private boolean isAvailable;
	private String filename;
	String value;
	// constructor
	public Media(int id, String title, int year) {
	this.id = id;
	this.title = title;
	this.year = year;
	isAvailable = true;
	}
	
	//create overloaded constructor for parsing out a line 
	public Media(String line) {
		id = Integer.parseInt(line.substring(line.indexOf("Begin ID=") + 9, line.indexOf("End ID")));
		title = line.substring(line.indexOf("Begin Title=") + 12, line.indexOf("End Title"));
		isAvailable = Boolean.parseBoolean(line.substring(line.indexOf("Available to Rent?:") + 19, line.indexOf("Rental fee:")));
		
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilename() {
		return this.filename;
	}
	// get methods
	public int getId() {
	return id;
	}
	public String getTitle() {
	return title;
	}
	public int getYear() {
	return year;
	}
	// set methods
	public void setTitle(String title) {
	this.title = title;
	}
	public void setYear(int year) {
	this.year = year;
	}
	// calculate rental fee; for generic media it is flat fee $3.50
	public double calculateRentalFee() {
	return 3.50;
	}
	//get method for isAvailable
	public boolean getAvailability() {
		return isAvailable;
	}
	//set method for isAvailable
	public void setAvailability(boolean rented) {
		this.isAvailable = rented;
	}
	public String cleanPrint() {
		String cleanVersion = "Media Title: " + getTitle() + "\nMedia ID" + getId() + "\nAvailable?: " + getAvailability() + "\n\n\n";
		return cleanVersion;
	}
}
