
public class Squirtle extends Pokemon{
	
	private String type;
	private String name;
	private String attack;

	public Squirtle() {
		type = "Water type";
		name = "Squirtle";
		attack = "WATER GUN!";
	}
	
	public void chosen() {
		String displayChosen = name + "! I choose you!";
		System.out.println(displayChosen);
	}
	public void attack() {
		String message = "Now " + name + "! use " + attack;
		System.out.println(message);
	}
}
