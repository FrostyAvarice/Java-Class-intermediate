import java.util.Arrays;
import java.util.Scanner;

public class Week1_PracticeAsgn {

	public static void main(String[] args) {
		
		Scanner scanString = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		
		
		int option;
		
		int x = 1; 
		
		while (x == 1) {
			displayOptions();
			option = scanInt.nextInt();
			if (option == 1) {
				optionOne();
				
			} else if ( option == 2) {
				System.out.println("Performing action 2....");
			} else if (option == 3) {
				System.out.println("Performing action 3...");
			} else if (option == 4) {
				System.out.println("Performing action 4...");
			} else if (option == 5) {
				System.out.println("Exiting program"); 
				break;
			} else {
				System.out.println("Invalid input provided"); 
			}//end of conditionals
		}//end of  while loop 

	}
	
	public static void displayOptions() {
		System.out.println("Please select an option");
		System.out.println("Option 1 for creating a list of candles");
		System.out.println("Option 2 for removing a candle off the list");
		System.out.println("Option 3 for displaying all of the candles in the list");
		System.out.println("Option 4 to light or extinguish a candle in the list of candles");
		System.out.println("Option 5 to exit program");
		
	}
	
public static void optionOne() {
	Scanner scanString = new Scanner(System.in);
	Scanner scanDouble = new Scanner(System.in);
	Scanner scanInt = new Scanner(System.in);
	System.out.println("Please tell us how many candles you would like to input? Max of ten");
	int input = scanInt.nextInt();
	PracticeAsgn_Candle[] candles = new PracticeAsgn_Candle[20];
	for (int i = 1; i < input; i++) {
		System.out.println("Please provide the desired color for candle:" + i);
		String color = scanString.nextLine();
		System.out.println("Please provide the height for candle:" + i);
		double height = scanDouble.nextDouble();
		System.out.println("Please provide the diameter for candle:" + i);
		double diameter = scanDouble.nextDouble();
		candles[i] = new PracticeAsgn_Candle(color,height,diameter); 
	}
	
	
}

}
