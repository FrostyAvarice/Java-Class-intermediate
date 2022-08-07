
public class MarineMember extends MilitaryMember {

	// create attribute
	private String crayonFlavor;

	// create constructor
	public MarineMember(String ID, String crayonFlavor) {
		super(ID);
		this.crayonFlavor = crayonFlavor;
	}

	public String toString() {
		String display = "ID: " + getID() + "\nFavorite crayon flavor: " + crayonFlavor;
		return display;
	}
	public void soundOff() {
		System.out.println("OOO-RAH!");
	}

}
