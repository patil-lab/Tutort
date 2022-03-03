package Examples;

public class findMaxSubset {

	private static int findMaxSubset(String[] str, int zero, int one) {

		return helper(str, zero, one, 0);
	}

	private static int helper(String[] strings, int zero, int one, int index) {
		if (index > strings.length || zero + one == 0)
			return 0;

		int[] count = count(strings[index]);

		//consider

		int consider = 1 + helper(strings, zero - count[0], one - count[1], index + 1);

		//skip
		int skip = helper(strings, zero, one, index + 1);

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

