package practice;

public class RearrangeArray {
	public static void main(String[] args) {
		int[] arr = {3, 1, -2, -5, 2, -4};
		reArramgeArr(arr);
	}

	private static int[] reArramgeArr(int[] nums) {

		int l = nums.length;
		int[] newArr = new int[l];
		int even_ptr = 0, odd_ptr = 1;
		for (int i = 0; i < l; i++) {
			if (nums[i] >= 0) {
				newArr[even_ptr] = nums[i];
				even_ptr += 2;
			} else {
				newArr[odd_ptr] = nums[i];
				odd_ptr += 2;
			}

		}

		return newArr;


	}
}
