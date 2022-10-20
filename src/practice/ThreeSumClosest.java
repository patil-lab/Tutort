package practice;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] main) {
		int[] arr = {-1, 2, 1, -4};
		System.out.println(threeSumClosest(arr, 1));
	}

	private static int threeSumClosest(int[] nums, int target) {
		int l = nums.length;
		int ans = 0;
		Arrays.sort(nums);
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < l - 2; i++) {
			int high = l - 1;
			int low = i + 1;

			while (low < high) {
				int temp = nums[i] + nums[low] + nums[high];
				if (Math.abs(target - temp) < diff) {
					ans = temp;
					diff = Math.abs(target - temp);
				}
				if (temp == target)
					return target;
				else if (temp > target) {
					high--;
				} else {
					low++;
				}
			}
		}
		return ans;
	}
}
