
public class MilitaryMember {

	//create attributes
	private String ID;

	
	// create constructor
	public MilitaryMember(String ID) {
		if (ID == null || ID.isBlank() || ID.isEmpty())
			throw new IllegalMilitaryArgumentException(ID);
		
		this.ID = ID;
	}
	public String getID() {
		return ID;
	}
	
	public void soundOff() {
		System.out.println("Yes sir!");
	}
	
	public void ordersReceived(String orders) {
		System.out.println("But Sarge, do I have to?");
	}
	
	public void ordersReceived(int hazardpay) {
		System.out.println("I can deal with some bullets for the right pay");	
	}
}
