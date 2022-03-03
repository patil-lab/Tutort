package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem13 {
	public static void main(String[] args) {
		String[] votes = {"ABC", "ACB", "ABC", "ACB", "ACB"};
		String ans = rankTeams(votes);
		System.out.println(ans);
	}

	private static String rankTeams(String[] votes) {

		Map<Character, Integer> map = new HashMap<>();
		int l = votes[0].length();
		for (String vote : votes) {
			for (int i = 0; i < l; i++) {
				char c = vote.charAt(i);
				map.putIfAbsent(c, 0);
				map.put(c, map.get(c) + 1 - i);
			}
		}

		List<Character> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (a, b) -> {
			for (int i = 0; i < l; i++) {
				if (map.get(a) != (map.get(b))) {
					return map.get(b) - map.get(a);
				}
			}
			return a - b;
		});


		StringBuilder sb = new StringBuilder();
		for (char c : list) {
			sb.append(c);
		}

		return sb.toString();
	}
}
