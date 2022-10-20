package practice;

public class RemoveElement {
	public static void main(String[] args) {
		int[] arr = {3, 2, 2, 3, 2};
		int val = 2;
		System.out.println(removeElement(arr, val));
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
		for (int k = j; k < l; k++) {
			nums[k] = 0;
		}

		return j;
	}
}
