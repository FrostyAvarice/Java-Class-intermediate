/*Name: Devin Spiker 
 *Course: CMIS 242 - 6384
 *Date: 18 May 2022
 *Description: A program that models a Fire object
 **/
import java.util.Scanner;

public class Fire {

	//define attributes
	private int logs; // quantity of logs. Will use getter and setter to change this attribute 
	private String size; //size. getter and setter will be made
	private String flameColor;// color, getter and setter
	private boolean isLit; //whether fire is lit or not
	
	//create constructor which will determine the default for flames being created
	
	public Fire(String size,String flameColor) {
		this.logs = 5;//default fire will start with 5 logs
		this.size = size; // size will be stored in a string and determined by user
		this.flameColor = flameColor;//flame color will be a string and determined by user
		this.isLit = false;// default flame will not be lit 
	}
	//method for adding logs 
	public void addLogs() {
		logs++;
	}
	//method for removing logs
	public void removeLogs() {
		logs--;
	}
	
	public int getLogs() {
		return logs;
	}
	private void changeLogQuantity() {
		Scanner scanInt = new Scanner(System.in);
		System.out.println("Please enter the desired quantity of logs");
		logs = scanInt.nextInt();
	}
	public void setLogs() {
		changeLogQuantity();
	}
	//method for changing flame color
	private void changeColor() {
		System.out.println("Please provide the desired color for the fire");
		Scanner scanString = new Scanner(System.in);
		String newColor = scanString.nextLine();
		this.flameColor = newColor;
	}
	public String getColor() {
		return this.flameColor;
	}
	public void setColor() {
		changeColor();
	}
	//method for starting the fire 
	private void startFire() {
		this.isLit = true;
	}
	//method for putting out the fire 
	private void extinguish() {
		this.isLit = false;
	}
	public boolean getIsLit() {
		return isLit;
	}
	public void setIsLit(){
		Scanner scanString = new Scanner(System.in);
		System.out.println("Would you like the flame lit or extinguished?");
		String selection = scanString.next();
		if (selection.equalsIgnoreCase("Lit")) {
			startFire();
		} else if (selection.equalsIgnoreCase("Extinguished")) {
			extinguish();
		}
	}
	//method for displaying fire info
	public void printFlame() {
		System.out.println("\n\n");
		System.out.println("The size of the fire is " + this.size);
		System.out.println("The color of the fire is " + this.flameColor);
		System.out.println("The amount of logs is:" + this.logs);
		System.out.println("Fire is lit?:" + this.isLit);
	}
}// end of Fire class
