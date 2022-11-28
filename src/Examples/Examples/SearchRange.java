package Examples;

public class SearchRange {

	public static void main(String[] args) {

		int[] arr = {5, 7, 7, 8, 8, 9, 10};
		int[] res = searchRange(arr, 8);
		System.out.println();
	}

	private static int[] searchRange(int[] arr, int target) {
		int[] result = new int[2];
		result[0] = findStartigIndex(arr, target);
		result[1] = findEndIndex(arr, target);
		return result;
	}

	private static int findEndIndex(int[] arr, int target) {
		int index = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] <= target) {
				start = mid + 1;
			} else end = mid - 1;
			if (arr[mid] == target) index = mid;

		}
		return index;
	}

	private static int findStartigIndex(int[] arr, int target) {

		int index = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] >= target) {
				end = mid - 1;
			} else start = mid + 1;
			if (arr[mid] == target) index = mid;
		}
		return index;

	}


}
