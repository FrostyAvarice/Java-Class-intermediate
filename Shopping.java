//Child class
/*Louis, Mamon
  CMIS 242/6384
  25 Jun 2022*/
public class Shopping extends Application{
	private int cart;	//Local attribute

	public Shopping(String name, double megabytes, int cart) {	//Constructor
		super(name, megabytes);
		if (cart <= 0)
            throw new IllegalShoppingCartException(cart);
		
		setCart(cart);
	}

	public int getCart() {		//Get and set method
		return cart;
	}
	public void setCart(int cart) {
		this.cart = cart;
	}
	public void setCompatibility(String compatibility) {
		this.compatibility = compatibility;
	}
	
	public String toString() {
		return "Shopping [" +getName()+ ", " +getMegabytes()+ "MB, "
				+getCart()+ " item(s), Compatibility: "+getCompatibility()+" or later]";
	}
}
