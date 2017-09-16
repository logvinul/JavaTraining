package operators;

public class uslovievuslovie {

	public static void main(String[] args) {
		boolean y = false;
		int x = 96;
		if (x % 16 == 0) {
			y = internalMethod(x);
		} else {
			y = false;
		}
		System.out.println(y);

	}

	private static boolean internalMethod(int x) {
		boolean y;
		if (x % 16 == 0) {
			y = true;
		} else {
			y = false;
		}
		y = true;
		return y;
	}

}
