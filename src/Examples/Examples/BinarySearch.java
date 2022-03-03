package Examples;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {2, 4, 7, 8, 9, 22, 23, 89};
		int num = binarySearch(nums, 7);
		System.out.println(num);
	}

	private static int binarySearch(int[] nums, int x) {
		int l = nums.length;
		int start = 0;
		int end = l - 1;
		int mid;

		while (start <= end) {
			mid = (start + end) / 2;
			if (x == nums[mid]) {
				return mid;
			} else if (x < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return -1;
	}
}
