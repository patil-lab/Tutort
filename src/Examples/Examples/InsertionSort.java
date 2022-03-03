package Examples;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {2, 0, 1, 3, 8};
		sortArray(arr);
	}

	private static int[] sortArray(int[] nums) {

		int l = nums.length;

		for (int i = 1; i < l - 1; i++) {
			int value = nums[i];
			int hole = i;
			while (hole > 0 && nums[hole - 1] > value) {
				nums[hole] = nums[hole - 1];
				hole = hole - 1;
			}
			nums[hole] = value;
		}

		return nums;

	}
}
