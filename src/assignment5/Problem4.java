package assignment5;

import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		int ans = numberOfSteps(nums);
		System.out.println();
	}

	private static int numberOfSteps(int[] nums) {
		//sort Array
		Arrays.sort(nums);

		int n = nums.length;


		int steps = 0;
		//calculate steps
		for (int i = n - 1; i >= 0; i--) {
			steps += nums[i] - nums[0];
		}
		return steps;
	}
}
