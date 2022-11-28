package Examples;

public class Xor {

	public static void main(String[] args) {
		int n = 4, start = 3;
		int res = 0;
		for (int i = start; i < n; i++) {

			res ^= start + 2 * i;

		}

		System.out.println(res);

	}
}
