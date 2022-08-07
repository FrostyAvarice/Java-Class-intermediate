import java.text.DecimalFormat;

public class MovieDVD extends Media {
	// local attributes
	private double size; // value in MB
	// constructor
	public MovieDVD(int id, String title, int year, double size) {
	super(id, title, year);
	this.size = size;
	}
	//create overloaded constructor
	public MovieDVD(String line) {
		super(line);
		size = Double.parseDouble(line.substring(line.indexOf("Begin Size=")+11, line.indexOf("MB]")));
	}
	// get method
	public double getSize() {
	return size;
	}
	// set method
	public void setSize(double size) {
	this.size = size;
	}
	// inherits calculate rental fee method and no different calculation so should
	
	//not override
	@Override
	public String toString() {
	DecimalFormat format = new DecimalFormat("#.00");
	return "Start" + " MovieDVD +  [" + "Begin ID=" + getId() + "End ID" + "Begin Title=" + getTitle() + "End Title" + "Begin Size=" + size + "MB]" + "Available to Rent?:" + getAvailability() + "Rental fee:" + format.format(calculateRentalFee()) + "Finish"; 
	}
	public String cleanPrint() {
		DecimalFormat format = new DecimalFormat("$#.00");
		String cleanVersion = "Media Title: " + getTitle() + "\nMedia ID: " + getId() + "\nSize: "+ size + "\nAvailable?: " + getAvailability() + "\nRental Fee:" + format.format(calculateRentalFee()) + "\n\n\n";
		return cleanVersion;
	}
}
	
	