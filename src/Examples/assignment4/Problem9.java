package assignment4;

import java.util.Arrays;

public class Problem9 {

	public static void main(String[] args) {
		int nums1[] = {1, 2, 2, 1};
		int nums2[] = {2, 2};
		Integer[] inter = intersection(nums1, nums2);
		//int[] union=union(nums1,nums2);
		System.out.println();

	}

	private static Integer[] intersection(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		if (m > n) {
			int[] tempp = nums1;
			nums1 = nums2;
			nums2 = tempp;

			int temp = m;
			m = n;
			n = temp;
		}
		Arrays.sort(nums1);
		Integer[] arr = new Integer[m];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (binarySearch(nums1, 0, m - 1, nums2[i]) != -1) {

				arr[j] = nums2[i];
				j++;
			}
		}
		return arr;
	}

	private static int binarySearch(int[] nums1, int l, int r, int val) {

		if (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums1[mid] == val) return mid;
			else if (nums1[mid] < val) {
				return binarySearch(nums1, mid + 1, r, val);
			} else {
				return binarySearch(nums1, l, mid - 1, val);
			}

		}
		return -1;


	}
}
