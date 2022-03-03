package Examples;

public class Factorial {

	public static void main(String args[]) {

		int n = fact(2);
		System.out.println("");
	}

	private static int fact(int n) {

		if (n >= 1)
			return n * fact(n - 1);
		else
			return 1;
	}
}
