package assignment5;

public class Problem15 {

	public static int dp[][];

	public static void main(String[] args) {
		String[] strs = {"10", "0001", "111001", "1", "0"};
		int max = findMaxSubset(strs, 5, 3);
		System.out.println(max);
	}

	private static int findMaxSubset(String[] strs, int m, int n) {
		dp = new int[m + 1][n + 1];
		for (String s : strs) {
			int[] count = count(s);
			for (int zero = m; zero >= count[0]; zero--) {
				for (int one = n; one >= count[1]; one--) {
					dp[zero][one] = Math.max(dp[zero - count[0]][one - count[1]] + 1, dp[zero][one]);
				}
			}
		}

		return dp[m][n];
	}

	private static int helper(String[] str, int zero, int one, int index) {
		if (index == str.length || zero + one == 0)
			return 0;

		int[] count = count(str[index]);

		//consider
		int consider = 0;
		if (zero >= count[0] && one >= count[1])
			consider = 1 + helper(str, zero - count[0], one - count[1], index + 1);

		int skip = helper(str, zero, one, index + 1);

		return Math.max(consider, skip);
	}

	private static int[] count(String str) {

		int[] count = new int[2];
		for (char c : str.toCharArray()) {
			count[c - '0']++;
		}

		return count;
	}
}
