
public class ArmyMember extends MilitaryMember {
	
	//create attribute
	private String dutyTitle; 
	
	//create constructor
	public ArmyMember(String ID,String dutyTitle) {
		super(ID);
		this.dutyTitle = dutyTitle;
	}
	
	public String toString() {
		String display = "ID: " + getID() + "\nDuty Title: " + dutyTitle;
		return display;
	}
	
	public void soundOff() {
		System.out.println("HOO-AH!");
	}

}
