package assignment4;

import java.util.HashMap;

public class Problem2 {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 4};
		Boolean bool = containsDuplicate(nums);
		System.out.println(bool);
	}

	private static Boolean containsDuplicate(int[] nums) {
		int m = nums.length;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < m; i++) {
			if (!hashMap.containsKey(nums[i])) {
				hashMap.put(nums[i], 1);
			} else {
				hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
			}
		}
		for (int i = 0; i < m; i++) {
			if (hashMap.get(nums[i]) > 1) {
				return true;
			}
		}

		return false;
	}
}
