/*Name: Devin Spiker 
 *Course: CMIS 242 - 6384
 *Date: 18 May 2022
 *Description: A program that creates several fire objects and demonstrates editing the attributes of a fire object
 */
public class FireMain {

	public static void main(String[] args) {
		//create several Fire objects
		Fire f1 = new Fire("Big","Blue");
		Fire f2 = new Fire("Small","Red");
		Fire f3 = new Fire("Medium", "Yellow");
		// use methods of fire class to edit attributes
		System.out.println(f1.getColor());
		System.out.println(f2.getIsLit());
		System.out.println(f3.getLogs());
		
		f1.addLogs();
		f2.setColor();
		f3.removeLogs();
		
		System.out.println(f1.getLogs());
		System.out.println(f2.getColor());
		System.out.println(f3.getLogs());
		
		f1.setLogs();
		f2.setIsLit();
		System.out.println(f3.getLogs());
		
		f1.printFlame();
		f2.printFlame();
		f3.printFlame();
		
		f1.setIsLit();
		f2.setIsLit();
		f3.setIsLit();
		System.out.println(f1.getIsLit());
		System.out.println(f2.getIsLit());
		System.out.println(f3.getIsLit());
		
	}// and of main method
}//end of fire main class
