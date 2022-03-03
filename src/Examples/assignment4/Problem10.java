package assignment4;

public class Problem10 {

	public static void main(String[] args) {
		int[] nums1 = {4, 1, 2};
		int[] nums2 = {1, 3, 4, 2};
		int[] nge = nextGreaterElement(nums1, nums2);
		System.out.println();
	}

	private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] arr = new int[m];
		int r = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (nums1[i] == nums2[j]) {
					int flag = 0;
					for (int k = j; k < n; k++) {
						if (nums2[k] > nums2[j]) {

							arr[r++] = nums2[k];
							flag = 1;
							break;
						}
					}
					if (flag == 0)
						arr[r++] = -1;
				}

			}
		}
		return arr;
	}
}
