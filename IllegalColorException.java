
public class IllegalColorException extends IllegalArgumentException{

	public String color;
	
	public IllegalColorException(String color){
		super(color + " is not a valid color for this object, color will remain the same.");
	}
}
