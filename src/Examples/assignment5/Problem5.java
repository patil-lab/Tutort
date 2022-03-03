package assignment5;

public class Problem5 {

	public static void main(String[] args) {
		int[] g = {1, 2, 3};
		int[] s = {1, 1};
		int ans = findContentChildren(g, s);
		System.out.println();
	}

	private static int findContentChildren(int[] g, int[] s) {
		int m = g.length;
		int n = s.length;
		int kidsCount = 0;
		int contentKids = 0;
		for (int i = 1; i < n && kidsCount < m; i++) {


			if (s[i] >= g[kidsCount]) {
				contentKids++;
				kidsCount++;


			}
		}

		return contentKids;
	}


}
