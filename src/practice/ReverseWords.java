package practice;

public class ReverseWords {

	public static void main(String[] args) {

		String s = "i love you";
		reverseWords(s);
	}

	private static String reverseWords(String s) {

		int start = 0;
		char[] chrAr = s.toCharArray();
		for (int end = 0; end < chrAr.length; end++) {
			if (chrAr[end] == ' ') {
				reverse(chrAr, start, end);
				start = end + 1;
			}
		}
		reverse(chrAr, start, chrAr.length - 1);
		reverse(chrAr, 0, chrAr.length - 1);
		return String.valueOf(chrAr);
	}

	private static void reverse(char[] s, int start, int end) {

		char temo;
		while (start <= end) {
			temo = s[start];
			s[start] = s[end];
			s[end] = temo;
			start++;
			end--;
		}
	}
}
