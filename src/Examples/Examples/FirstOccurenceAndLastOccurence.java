package Examples;

public class FirstOccurenceAndLastOccurence {

	public static void main(String args[]) {
		int[] nums = {2, 3, 4, 4, 4, 7, 8, 90};
		int num = firstOccurence(nums, 4);
		int num1 = lastOccurence(nums, 4);
		System.out.println(num1 - num + 1);
	}

	private static int firstOccurence(int[] nums, int x) {

		int l = nums.length;
		int start = 0;
		int end = l - 1;
		int mid, result = -1;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (x == nums[mid]) {
				result = mid;
				end = mid - 1;
			} else if (x > nums[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}


		}
		return result;
	}

	private static int lastOccurence(int[] nums, int x) {

		int l = nums.length;
		int start = 0;
		int end = l - 1;
		int mid, result = -1;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (x == nums[mid]) {
				result = mid;
				start = mid + 1;
			} else if (x > nums[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}


		}
		return result;
	}
}
