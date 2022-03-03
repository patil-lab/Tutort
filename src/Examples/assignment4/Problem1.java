package assignment4;

public class Problem1 {

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 2, 5, 0};
		int[] ints = moveZeroes2(nums);
		System.out.println("");

	}

	private static int[] moveZeroes(int[] nums) {
		int m = nums.length;
		int j = 0;
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			if (nums[i] != 0) {
				arr[j] = nums[i];
				j++;
			}
		}

		return arr;
	}

	private static int[] moveZeroes2(int[] nums) {
		int m = nums.length;
		int j = 0;
		for (int i = 0; i < m; i++) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}
		for (int i = j; i < m; i++) {
			nums[i] = 0;
		}
		return nums;
	}
}
