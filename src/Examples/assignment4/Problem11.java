package assignment4;

public class Problem11 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 1};
		int[] ans = nextGreaterElements(nums);
		System.out.println();
	}

	private static int[] nextGreaterElements(int[] nums) {

		int m = nums.length;

		int[] arr = new int[m];
		int n = 0;
		for (int i = 0; i < m; i++) {
			int flag = 0;
			for (int j = i + 1; j < m + i; j++) {

				if (nums[j % m] > nums[i]) {
					arr[n++] = nums[j % m];
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				arr[n++] = -1;

		}

		return arr;
	}
}
