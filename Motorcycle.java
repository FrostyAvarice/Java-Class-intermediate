// Name: Ekkert, Clifton 	CMIS 242/6384 	Date: (05/17/2022)

//Model real object as java class
public class Motorcycle {

	// Attributes
	public String topSpeed;
	public String sixtySpeed;
	public String fuelType;//Devin Spiker added this attribute

	// Constructor
	public Motorcycle(String topSpeed, String sixtySpeed,String fuelType) {
		this.sixtySpeed = sixtySpeed;
		this.topSpeed = topSpeed;
		this.fuelType = fuelType;//Spiker added attribute to be included in constructor
	}
	// Methods

	// Method to set 0-60 time and top speed
	public void setAttributes(String top, String sixty) {
		sixtySpeed = sixty;
		topSpeed = top;
	}
	//Spiker - to keep in line with your style of using 'setters/getters' i created a separate method for settingfuelType
	public void setFuelType(String fuel) {
		fuelType = fuel;
	}
	//Spiker-  created a getter to obtain the fueltype
	public String getFuelType() {
		return this.fuelType;
	}

	// Method to access 0-60 time
	public String getSixtySpeed() {
		return this.sixtySpeed;
	}

	// Method to access top speed
	public String getTopSpeed() {
		return this.topSpeed;
	}

	// Method to display 0-60 time and top speed
	//Spiker added the fuelType attribute to this output method
	public void outputAttributes(String sixtySpeed, String topSpeed, String fuelType) {
		System.out.println("Your motorcycle's top speed is " + topSpeed + " and it's 0-60 time is " + sixtySpeed + ".");
		System.out.println("Fuel type: " + fuelType);
	}

	public static void main(String[] args) {
		System.out.println("**Name: Ekkert, Clifton / CMIS 242/6384 / " + java.time.LocalDate.now() + "**\n\n");

		Motorcycle w650 = new Motorcycle("5.1 seconds", "110 mph","Electric"); // Create new instance
		w650.setAttributes(w650.getSixtySpeed(), w650.getTopSpeed()); // Call setAttributes method
		w650.setFuelType(w650.getFuelType());//Spiker added additional method to set fuel type, and then edited the output attributes to print the fuel type
		w650.outputAttributes(w650.getSixtySpeed(), w650.getTopSpeed(), w650.getFuelType()); // Call outputAttributes method
	}
}
