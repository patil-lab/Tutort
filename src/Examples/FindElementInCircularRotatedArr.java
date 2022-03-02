package Examples;

public class FindElementInCircularRotatedArr {


	public static void main(String args[]) {
		int[] nums = {8, 90, 2, 3, 4, 4, 4, 7};
		int num = findElement(nums, 7);
		System.out.println(num);
	}


	private static int findElement(int[] nums, int x) {
		int l = nums.length;
		int start = 0;
		int end = l - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (x == nums[mid]) return mid;
			if (nums[mid] <= nums[end]) {
				if (x > nums[mid] && x <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			if (nums[start] <= nums[mid]) {
				if (x >= nums[start] && x < nums[mid]) {

					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
