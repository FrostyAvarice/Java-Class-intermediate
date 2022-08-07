
public class RecursionDemo {

	
	private static int raiseToPower (int x) {
		if (x == 1) {
			return x;
		}
		return x * x + raiseToPower(x-1);//9 + 4 + 1 = 14
	}
	
	public static void main(String[] args) {
		System.out.println(raiseToPower(3));
	}
}
