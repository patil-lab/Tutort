package practice;

public class LongestCommonSequence {
	public static void main(String[] args) {
		System.out.println(longestCommonSequence("abcde", "ace", 5, 3));
	}

	private static int longestCommonSequence(String s1, String s2, int m, int n) {

		int[][] LCS_table = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					LCS_table[i][j] = 0;
				else if (s1.charAt(i - 1) == s2.charAt(j - 1))
					LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
				else
					LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
			}
		}
		int index = LCS_table[m][n];
		int i = m, j = n;
		char[] lcs = new char[index + 1];
		lcs[index] = '\0';
		while (i > 0 && j > 0) {
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				lcs[index - 1] = s1.charAt(i - 1);

				i--;
				j--;
				index--;
			} else if (LCS_table[i - 1][j] > LCS_table[i][j - 1])
				i--;
			else j--;
		}
		return lcs.length - 1;
	}
}
