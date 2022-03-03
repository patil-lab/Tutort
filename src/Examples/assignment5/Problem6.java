package assignment5;

import java.util.HashMap;

public class Problem6 {

	public static void main(String[] args) {
		int[] nums = {1, 5, 2, 3, 5, 4, 5, 6};
		int ans = findShortestSubArray(nums);
		System.out.println();
	}

	private static int findShortestSubArray(int[] nums) {
		int l = nums.length;
		int degree = 0;
		int minLength = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		HashMap<Integer, Integer> firstOccurence = new HashMap<>();
		for (int i = 0; i < l; i++) {
			firstOccurence.putIfAbsent(nums[i], i);
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
			if (hashMap.get(nums[i]) > degree) {
				degree = hashMap.get(nums[i]);
				minLength = i - firstOccurence.get(nums[i]) + 1;
			} else if (hashMap.get(nums[i]) == degree) {
				minLength = Math.min(minLength, i - firstOccurence.get(nums[i]) + 1);
			}

		}
		return minLength;
	}
}
