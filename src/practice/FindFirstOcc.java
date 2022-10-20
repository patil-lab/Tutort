package practice;

public class FindFirstOcc {
	public static void main(String[] args) {
		String s1 = "adbutsad";
		String s2 = "sad";
		System.out.println(strStr4(s1, s2));
	}

	private static int strStr3(String hayStack, String needle) {
		int m = hayStack.length();
		int n = needle.length();
		for (int i = 0; i <= m - n; i++) {
			int j = 0;
			for (; j < n; j++) {
				if (hayStack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == n)
				return i;
		}
		return -1;
	}

	private static int strStr4(String hayStack, String needle) {
		int m = hayStack.length();
		int n = needle.length();
		int p = 0;
		while (p + n - 1 < m) {
			if (hayStack.substring(p, n).equals(needle))
				return p;
			while (p++ + n - 1 < m && hayStack.charAt(p) != needle.charAt(0)) ;
		}
		return -1;
	}

	private static int strStr(String s1, String s2) {
		return (s1.indexOf(s2));
	}
}
