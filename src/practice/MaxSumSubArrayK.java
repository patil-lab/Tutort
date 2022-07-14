package practice;

public class MaxSumSubArrayK {
	public static int start, end;

	public static void main(String[] args) {

		int[] arr = new int[]{2, 3, -1, 4, 0, 0};
		maxSum(arr, 3);
	}

	public static int maxSum(int[] nums, int k) {
		// Compute sum of first window of size k
		int win_sum = 0, s = 0;
		for (int i = 0; i < k; i++)
			win_sum += nums[i];


		int max_sum = win_sum;
		for (int i = k; i < nums.length; i++) {
			win_sum += nums[i] - nums[i - k];
			s += 1;
			if (win_sum > max_sum) {
				max_sum = win_sum;
				start = s;
				end = s + k - 1;
			}
		}

		return max_sum;
	}


}
