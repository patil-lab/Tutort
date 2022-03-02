package assignment4;

import java.util.HashMap;

public class Problem3 {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 1, 2, 3};
		int k = 2;
		Boolean bool = containsNearByDuplicate(nums, k);
		System.out.println(bool);
	}

	///doubt

	private static Boolean containsNearByDuplicate(int[] nums, int k) {
		int m = nums.length;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < m; i++) {
			if (!hashMap.containsKey(nums[i])) {
				hashMap.put(nums[i], 1);
			} else {
				int x = hashMap.get(nums[i]);
				if (Math.abs(x - i) <= k) {
					return true;
				} else
					hashMap.put(nums[i], i);
			}
		}

		return false;

	}
}
