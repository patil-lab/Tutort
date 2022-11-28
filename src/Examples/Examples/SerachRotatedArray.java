package Examples;

public class SerachRotatedArray {

	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 0, 1, 2};
		int target = 3;
		int i = serachTarget1(arr, target);
		System.out.println(i);
	}

	private static int searchTarget(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (arr[mid] > arr[right]) {
				left = mid + 1;
			} else right = mid;
		}
		return arr[left];
	}

	private static int serachTarget1(int[] arr, int target) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (arr[mid] == target) return mid;
			if (arr[mid] >= arr[low]) {
				if (target >= arr[low] && target < arr[mid]) high = mid - 1;
				else low = mid + 1;
			} else {
				if (target > arr[mid] && target <= arr[high]) low = mid + 1;
				else high = mid - 1;
			}
		}
		return -1;
	}
}
