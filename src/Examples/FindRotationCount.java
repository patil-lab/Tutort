package Examples;

public class FindRotationCount {

	public static void main(String args[]) {
		int[] nums = {8, 90, 2, 3, 4, 4, 4, 7};
		int num = rotationCount(nums);
		System.out.println(num);
	}


	private static int rotationCount(int[] nums) {
		int l = nums.length;
		int start = 0;
		int end = l - 1;
		while (start <= end) {
			if (nums[start] <= nums[end]) return start;
			int mid = start + (end - start) / 2;
			int next = (mid + 1) % l, prev = (mid + l - 1) % l;
			if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) return mid;
			else if (nums[mid] <= nums[end]) end = mid - 1;
			else if (nums[mid] >= nums[start]) start = mid + 1;
		}

		return -1;
	}
}
