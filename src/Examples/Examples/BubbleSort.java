package Examples;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 4, 0};
		sortArray(arr);
	}

	private static int[] sortArray(int[] nums) {

		int l = nums.length;

		for (int i = 0; i < l; i++) {
			boolean flag = false;
			for (int j = 0; j < l - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
					flag = true;
					System.out.println(flag);
				}
			}
			if (Boolean.FALSE.equals(flag)) break;

		}
		return nums;

	}

}

