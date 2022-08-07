//Child class
/*Louis, Mamon
  CMIS 242/6384
  25 Jun 2022*/
public class Game extends Application{
	private String POV;	//Local attribute

	public Game(String name, double megabytes, String POV) {  //Constructor
		super(name, megabytes);
		setPOV(POV);
	}

	public String getPOV() {	//Get and set method
		return POV;
	}
	public void setPOV(String POV) {
		this.POV = POV;
	}
	public void setCompatibility() {
		this.compatibility = "iPhone 2";
	}
	public String toString() {
		return "Game [" +getName()+ ", " +getMegabytes()+ "MB, "
				+getPOV()+ " person, Compatibility: "+getCompatibility()+ " or later]";
	}
}