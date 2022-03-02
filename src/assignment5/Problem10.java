package assignment5;

import java.util.HashMap;

public class Problem10 {

	private static int singleNumber2(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int number = -1;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);

		}
		for (int num : nums) {
			if (map.get(num).equals(1)) {
				number = num;
			}
		}

		return number;

	}
}
