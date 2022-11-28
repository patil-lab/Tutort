package Examples;

public class MissingNumber {
	public static void main(String[] args) {

		int arr[] = {3, 0, 1};
		int num = missingNumber3(arr);
		System.out.println(num);
	}

	public static int missingNumber(int[] nums) {

		int i;
		int N = nums.length;
		int temp[] = new int[N + 1];
		for (i = 0; i <= N; i++)
			temp[i] = 0;

		for (i = 0; i < N; i++)
			temp[nums[i] - 1] = 1;

		int ans = 0;
		for (i = 0; i <= N; i++) {
			if (temp[i] == 0) {
				ans = i + 1;
			}

		}

		return ans;

	}

	public static int missingNumber1(int[] nums) {
		int n = nums.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++) {
			sum -= nums[i];
		}

		return sum;
	}

	public static int missingNumber3(int[] nums) {
		int n = nums.length;
		int xor = 0;
		for (int i : nums)
			xor = xor ^ i;

		for (int i = 0; i <= n; i++)
			xor = xor ^ i;

		return xor;

	}
}
