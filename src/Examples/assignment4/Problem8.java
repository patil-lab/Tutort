package assignment4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Problem8 {

	public static void main(String[] args) {
		int nums1[] = {1, 2, 2, 1};
		int nums2[] = {2, 2};
		Integer[] inter = intersection2(nums1, nums2);
		//int[] union=union(nums1,nums2);
		System.out.println();
	}

	private static int[] intersection(int[] nums1, int[] nums2) {

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
		int k = 0;
		int[] arr = new int[m];
		for (int i = 0; i < n; i++) {

			if (binarySearch(nums1, 0, m - 1, nums2[i]) != -1) {
				arr[k] = nums2[i];
				k++;
			}


		}

		return arr;


	}

	//for non-disctinct elements
	private static Integer[] intersection2(int[] nums1, int[] nums2) {

		int n = nums2.length;
		HashSet<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toCollection(HashSet::new));
		HashSet<Integer> set1 = new HashSet<>();


		for (int i = 0; i < n; i++) {
			if (set.contains(nums2[i])) {
				set1.add(nums2[i]);
			}
		}
		return set1.toArray(Integer[]::new);
	}

	private static int binarySearch(int[] nums, int l, int r, int x) {
		if (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] == x) return mid;
			if (x > nums[mid]) {
				return binarySearch(nums, mid + 1, r, x);
			} else {
				return binarySearch(nums, l, mid - 1, x);
			}

		}
		return -1;
	}
}
