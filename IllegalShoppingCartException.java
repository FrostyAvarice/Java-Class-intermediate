//User defined exception
/*Louis, Mamon
  CMIS 242/6384
  25 Jun 2022*/

public class IllegalShoppingCartException extends IllegalArgumentException {
	public int cart;
	public IllegalShoppingCartException(int cart) {
		super("Need atleast 1 item in cart: " + cart);
	}
	
	public class IllegalShoppingCartInputException extends IllegalArgumentException {
		public String cart;
		
		public IllegalShoppingCartInputException(String cart) {
			super("input must be a number, not a string");
		}
	}
}