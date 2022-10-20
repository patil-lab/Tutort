package practice;

import java.util.HashSet;
import java.util.Set;

public class Triplets {

	private static int triplets(int[] arr, int diff) {
		int l = arr.length;
		int count = 0;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {

				for (int k = j + 1; k < l; k++) {

					if (arr[j] - arr[i] == diff && arr[k] - arr[j] == diff)
						count++;
				}
			}
		}
		return count;
	}

	private static int triplets1(int[] arr, int diff) {

		int count = 0;
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			if (set.contains(num + diff) && set.contains(num + 2 * diff)) {
				count++;
			}
			set.add(num);
		}

		return count;
	}
}
