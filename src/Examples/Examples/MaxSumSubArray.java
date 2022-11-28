package Examples;

public class MaxSumSubArray {
	public static int findMaxSumSubArray(int k, int[] arr) {
		int maxSum = 0, windowSum;
		for (int i = 0; i <= arr.length - k; i++) {
			windowSum = 0;
			for (int j = i; j < i + k; j++) {
				windowSum += arr[j];
			}
			maxSum = Math.max(windowSum, maxSum);
		}

		return maxSum;
	}

	public static int findSum(int k, int[] arr) {
		int windowSum = 0, maxSum = 0;
		int windowStart = 0;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			windowSum += arr[windowEnd];
			if (windowEnd >= k - 1) {
				maxSum = Math.max(windowSum, maxSum);
				windowSum -= arr[windowStart];
				windowStart++;
			}

		}

		return
				maxSum;
	}

	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 1, 3, 2, 0};
		int ans = findSum(3, arr);
		System.out.println();
	}
}
