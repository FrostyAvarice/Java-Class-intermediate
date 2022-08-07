import java.util.Scanner;
public class MilitaryMemberMain {

	public static void main(String[] args) {
		Scanner scanString = new Scanner(System.in);
		System.out.println("Please provide ID for jeff");
		String jeffID = scanString.nextLine();
		

		NavyMember jeff = new NavyMember(jeffID, "High and Tight", "blue");
		

		
		
		ArmyMember jill = new ArmyMember("54321", "Artillery");
		MarineMember pyle = new MarineMember("34521", "Green");

		System.out.println("Navy Member Jeff\n" + jeff);
		System.out.println("\n");
		System.out.println("Army Memeber Jill\n" + jill);
		System.out.println("\n");
		System.out.println("Marine Memeber Pyle\n" + pyle);
		
		System.out.println("\nSOUNDOFF!");
		jeff.soundOff();
		jill.soundOff();
		pyle.soundOff();
		
		System.out.println("");
		jeff.ordersReceived("Get to work son!");
		jeff.ordersReceived(1000);
		
	}

}
