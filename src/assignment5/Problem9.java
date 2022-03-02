package assignment5;

import java.util.HashMap;

public class Problem9 {

	public static void main(String[] args) {
		int[] nums = {4, 1, 2, 1, 2};
		int ans = singleNumber(nums);
		System.out.println();
	}

	private static int singleNumber(int[] nums) {
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
