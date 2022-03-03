package Examples;

public class RemoveDupsInArray {

	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 3, 4, 4};
		int[] num = removeDups(nums);
		System.out.println();
	}

	private static int[] removeDups(int[] nums) {
		int n = nums.length;
		int l = 1;
		for (int r = 1; r < n; r++) {
			if (nums[r] != nums[r - 1]) {
				nums[l] = nums[r];
				l++;
			}
		}
		for (int i = l; i < n; i++) {
			nums[i] = 0;

		}

		return nums;

	}
}
