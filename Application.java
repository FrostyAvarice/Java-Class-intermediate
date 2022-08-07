//Parent class
/*Louis, Mamon
CMIS 242/6384
25 Jun 2022 */
public class Application {
	private String name;	//Attributes
	private double megabytes;
	public String compatibility;
	
	public Application(String name, double megabytes) { //Constructor
		setName(name);
		setMegabytes(megabytes);
		setCompatibility();
	}

	public String getName() {		//Get&set methods for each attribute
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getMegabytes() {
		return megabytes;
	}
	public void setMegabytes(double megabytes) {
		this.megabytes = megabytes;
	}

	public String getCompatibility() {
		return compatibility;
	}
	public void setCompatibility() {
		this.compatibility = "Works on this iPhone";
	}

	public String toString() {
		return "Default application [" +getName()+", " +getMegabytes()+"MB, Compatibility: "+getCompatibility()+"]";
	}
}