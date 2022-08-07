import java.util.Scanner;
public class PokemonBattle {

	public static void main(String[] args) {
		Scanner scanInt = new Scanner(System.in);
		int counter = 0;
		int userInput = 0;
		Pokemon yourPokemon = null;
		
		System.out.println(menu());
		userInput = scanInt.nextInt();
		if (userInput == 1) {
			yourPokemon = new Squirtle();
		} else if (userInput == 2) {
			yourPokemon = new Charizard();
		} 
		yourPokemon.chosen();
		yourPokemon.attack();
	}


	public static String menu() {
		String menu = "BATTLE!\nCHOSE YOUR POKEMON!\n1 for Squirtle or 2 for Charizard";
		return menu;
	}
}



