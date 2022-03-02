package Examples;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {2, 0, 1, 3, 8};
		sortArray(arr);
	}

	private static int[] sortArray(int[] nums) {

		int l = nums.length;

		for (int i = 0; i < l - 1; i++) {
			int iMin = i;
			boolean flag = false;
			for (int j = i + 1; j < l; j++) {
				if (nums[j] < nums[iMin])
					iMin = j;
				flag = true;
			}
			if (Boolean.TRUE.equals(flag)) {
				int temp = nums[i];
				nums[i] = nums[iMin];
				nums[iMin] = temp;
			}
		}
		return nums;
	}
}
