
public class IllegalMilitaryArgumentException extends IllegalArgumentException{

	private String msg;
	
	public IllegalMilitaryArgumentException(String ID) {
		if (ID == null)
			System.out.println("Must provide ID, cannot be null");
		
		
		if (ID.isBlank())
			System.out.println("PROVIDE IDENTIFICATION SIR");
		
		if (ID.isEmpty())
			System.out.println("Cannot be empty string");
	}
}
