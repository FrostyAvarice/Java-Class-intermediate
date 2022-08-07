import java.text.DecimalFormat;
import java.util.Calendar;

public class EBook extends Media{
	
	// local attributes
	private int numChapters;
	private boolean isAvailable;
	
	// constructor
	public EBook(int id, String title, int year, int chapters) {
	super(id, title, year);
	numChapters = chapters;
	}
	//overloaded constructor
	public EBook(String line) {
		super(line);
		numChapters = Integer.parseInt(line.substring(line.indexOf("chapters=") + 9, line.indexOf("End Chapters")));
		
		
	}
	// get method
	public int getNumChapters() {
	return numChapters;
	}
	// set method
	public void setNumChapters(int numChapters) {
	this.numChapters = numChapters;
	}
	// override parent's
	@Override
	public double calculateRentalFee() {
	double fee = numChapters * 0.10; // basic fee
	int currYear = Calendar.getInstance().get(Calendar.YEAR);
	if (this.getYear() == currYear)
	fee += 1; // add $1.00 fee
	return fee;
	}
	@Override
	public String toString() {
	DecimalFormat format = new DecimalFormat("#.00");
	return "Start   EBook [ Begin ID=" + getId() + "End ID" + ", Begin Title=" + getTitle()
	+ "End Title" + ", year=" + getYear() + ", chapters=" + numChapters + "End Chapters" +
	"Available to Rent?:" + getAvailability() + "Rental fee:" + format.format(calculateRentalFee()) + "   Finish";
	}
	public String cleanPrint() {
		DecimalFormat format = new DecimalFormat("$#.00");
		String cleanVersion = "Media Title: " + getTitle() + "\nMedia ID: " + getId() + "\nYear: "+ getYear() + "\nChapters: " + numChapters + "\nAvailable?: " + getAvailability() + "\nRental Fee:" + format.format(calculateRentalFee()) + "\n\n\n";
		return cleanVersion;
	}
}
