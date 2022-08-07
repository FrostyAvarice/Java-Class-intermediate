/*Louis, Mamon
CMIS 242/6384
19 Jun 2022 */
import java.util.Scanner;

public class Diner {
	public static void main(String[] args) {
		Consumable order = null; //Declares null order variable
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like to order food(1) or a drink(2)? Or 3 for a rock ");  //Display prompt
		int choice = input.nextInt();
		
			if(choice == 1)		//Choice 1 assigns order variable to Consumable class
				order = new Consumable();
			else if (choice == 2)		//Choice 2 assigns order variable to Drink class
				order = new Drink();
			else if (choice == 3)
				order = new Rock();
			else {
				System.out.print("Try again when ready to order");
				System.exit(0);
			}
		order.eat();	//Compile time verifies Consumable has eat method, run time invokes eat method based on class
		input.close();
	}
}