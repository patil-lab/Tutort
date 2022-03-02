package assignment5;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {

		int[] nums = {3, 2, 1};
		int num = thirdMax(nums);
		System.out.println();
	}

	private static int thirdMax(int[] nums) {
		int l = nums.length;
		Arrays.sort(nums);


		int max = Integer.MAX_VALUE;
		int count = 0;
		for (int i = l - 1; i >= 0; i--) {
			if (nums[i] != max) {
				max = nums[i];
				count++;
			}
			if (count == 3) {
				return max;
			}
		}

		if (count > 0) {
			return nums[l - 1];
		}

		return -1;
	}
}
