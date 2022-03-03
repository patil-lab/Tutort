package assignment5;

import java.math.BigInteger;

public class Problem8 {

	public static void main(String[] args) {
		int[] mnums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] ans = plusOne(mnums);
		System.out.println();
	}

	private static int[] plusOne(int[] nums) {
		StringBuilder s = new StringBuilder();
		for (int num : nums) {
			s.append(num);
		}
		BigInteger b = new BigInteger(s.toString());
		String str = String.valueOf(b.add(BigInteger.ONE));
		int[] ans = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ans[i] = Character.digit(str.charAt(i), 10);
		}

		return ans;

	}
}
