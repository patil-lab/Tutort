package assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		String[] words = {"bella", "label", "roller"};
		List<String> list = comonChars(words);
		System.out.println("");
	}

	private static List<String> comonChars(String[] words) {


		int[] a1 = new int[26];

		Arrays.fill(a1, Integer.MAX_VALUE);

		for (String word : words) {
			int[] a2 = new int[26];
			for (char c : word.toCharArray()) {
				a2[c - 'a']++;
			}

			for (int i = 0; i < 26; i++) {
				a1[i] = Math.min(a1[i], a2[i]);
			}
		}
		List<String> result = new ArrayList<>();

		for (int i = 0; i < 26; i++) {
			while (a1[i] > 0) {
				result.add("" + (char) (i + 'a'));
				a1[i]--;

			}
		}

		return result;

	}
}
