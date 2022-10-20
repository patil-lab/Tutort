package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinWindowString {

	public static void main(String[] args) {

		String str = "ADOBECODEBANC";
		String target = "ABC";
		System.out.println(minWinString2(str, target));
	}

	private static String minWinString(String str, String target) {
		String smallestString = "";
		char[] c1 = str.toCharArray();
		char[] c2 = target.toCharArray();
		List<Character> targetLis = new ArrayList<>();
		for (char c : c2) {
			targetLis.add(c);
		}
		List<List<Character>> list = new ArrayList<>();
		int n = c1.length;
		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				List<Character> innerList = new ArrayList<>();
				for (int k = i; k <= j; k++) {

					innerList.add(c1[k]);
				}
				list.add(innerList);
			}

		}

		for (List<Character> innList : list) {


			String listStr = innList.stream().map(e -> e.toString()).reduce((acc, e) -> acc + e).get();
			if (innList.containsAll(targetLis)) {
				smallestString = listStr;
				if (innList.size() < smallestString.length()) {
					smallestString = listStr;
				}
			}
		}
		return smallestString;
	}

	private static String minWinString2(String str, String pat) {
		int start = 0;
		int subStringStart = 0;
		int minLength = Integer.MAX_VALUE;
		int mathcinChar = 0;
		int l1 = str.length();
		int l2 = pat.length();
		char[] c1 = str.toCharArray();
		char[] c2 = pat.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : c2) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}


		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(c1[i])) {
				map.put(c1[i], map.get(c1[i]) - 1);

				if (map.get(c1[i]) >= 0) {
					mathcinChar++;
				}
			}

			while (mathcinChar == l2) {
				if (i - start + 1 < minLength) {
					minLength = i - start + 1;
					subStringStart = start;
				}
				start++;
				if (map.containsKey(c1[start])) {

					if (map.get(c1[start]) == 0) mathcinChar--;
					map.put(c1[start], map.get(c1[start]) + 1);

				}
			}


		}
		if (minLength > str.length()) {
			return "";
		}


		return str.substring(subStringStart, subStringStart - minLength);
	}
}
