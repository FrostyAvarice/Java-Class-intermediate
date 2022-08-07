import java.text.DecimalFormat;
import java.time.format.FormatStyle;
import java.util.Calendar;

public class MusicCD extends Media {

	// local attributes
	private int length;
	// constructor
	public MusicCD(int id, String title, int year, int length) {
	super(id, title, year);
	this.length = length;
	}
	
	//create overloaded method 
	public MusicCD(String line) {
		super(line);
		length = Integer.parseInt(line.substring(line.indexOf("length=") + 7, line.indexOf("min]")));
	}
	// get method
	public int getLength() {
	return length;
	}
	// set method
	public void setLength(int length) {
	this.length = length;
	}
	// override parent's
	@Override
	public double calculateRentalFee() {
	double fee = length * 0.02; // basic fee
	int currYear = Calendar.getInstance().get(Calendar.YEAR);
	if (this.getYear() == currYear)
	fee += 1; // add $1.00 fee
	return fee;
	}
	@Override
	public String toString() {
	DecimalFormat format = new DecimalFormat("#.00");
	return "Start   " + "MusicCD [ Begin ID=" + getId() + "End ID" + ", Begin Title=" + getTitle() + "End Title" + ", year="
	+ getYear() + "End Year" + ", length=" + length + "min]" + "Available to Rent?:" + getAvailability() + "Rental fee:" + format.format(calculateRentalFee()) + " Finish";
	}
	public String cleanPrint() {
		DecimalFormat format = new DecimalFormat("$#.00"); 
		String cleanVersion = "Media Title: " + getTitle() + "\nMedia ID: " + getId() + "\nLength: "+ length + "min" + "\nAvailable?: " + getAvailability() + "\nRental Fee:" + format.format(calculateRentalFee()) + "\n\n\n";
		return cleanVersion;
	}
}
