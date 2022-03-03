package assignment4;

public class Problem7 {

	public static void main(String[] args) {
		int[] nums = {3, 1, 3, 2, 5, 3};
		int ints = removeElement(nums, 3);
		System.out.println(ints);

	}

	private static int removeElement(int[] nums, int val) {
		int l = nums.length;
		int j = 0;
		for (int i = 0; i < l; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		for (int i = j; i < l; i++) {
			nums[i] = 0;
		}


		return j;
	}
}
