//Main thread
/*Louis, Mamon
  CMIS 242/6384
  25 Jun 2022*/

import java.util.Scanner;
public class AppStore {

	public static void main(String[] args) {
		//Object creation and displaying application information
	Shopping target = null;
	boolean valid = true;
	Scanner input = new Scanner(System.in);
	int items = 0;
	
	while (valid) {
		System.out.println("How many items would you like to add to cart? ");
		items = input.nextInt();
		
		try {
			target = new Shopping("Target", 96.1, items);
			valid = false;
		} 
			catch (IllegalShoppingCartException cart){
					System.out.println(cart.getMessage());
		}
	}
	
	System.out.print("\n"+target.toString()+ "\n");
	input.close();
	}	
}
