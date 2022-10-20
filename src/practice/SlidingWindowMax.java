package practice;

import Examples.BSTImpl;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMax {
	public static void main(String[] args) {

		int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
		int k = 3;
		List<Integer> list = slidingWindowMax2(arr, k);
	}

	private static List<Integer> slidingWindowMax(int[] arr, int k) {
		int l = arr.length;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < l - k + 1; i++) {

			int max = Integer.MIN_VALUE;
			for (int j = i; j < i + k; j++)
				max = Math.max(max, arr[j]);

			list.add(max);
		}
		return list;
	}

	private static List<Integer> slidingWindowMax2(int[] arr, int k) {
		List<Integer> list = new ArrayList<>();
		BSTImpl bst = new BSTImpl();
		BSTImpl.BstNode root = null;
		for (int i = 0; i < k; i++)
			root = bst.insert(root, arr[i]);

		int d = 0;
		for (int i = k; i < arr.length; i++) {
			list.add(bst.findMax(root));
			root = bst.delete(root, arr[d]);
			d += 1;
			root = bst.insert(root, arr[i]);
		}

		list.add(bst.findMax(root));
		return list;
	}


}
