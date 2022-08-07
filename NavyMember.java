
public class NavyMember extends MilitaryMember {
	// create attribute
	private String hairCut;
	private String uniformColor;

	// create constructor
	public NavyMember(String ID, String hairCut, String uniformColor) {
		super(ID);
		this.hairCut = hairCut;
		this.uniformColor = uniformColor;
	}

	public String toString() {
		String display = "ID: " + getID() + "\nDuty Title: " + hairCut + uniformColor;
		return display;
	}
	public void soundOff() {
		System.out.println("HOO-YAH!");
	}

}
