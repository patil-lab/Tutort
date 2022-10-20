package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

	public static void main(String[] args) {

		int[] ar = {-1, 0, 1, 2, -1, -4};
		threeSum1(ar, 0);
	}

	private static List<List<Integer>> threeSum(int[] arr, int k) {
		int l = arr.length;
		int curr_sum = 0;
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < l - 2; i++) {
			Map<Integer, Integer> map = new HashMap<>();
			int curr_Sum = k - arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (map.containsKey(curr_Sum - arr[j])) {
					list.add(Arrays.asList(arr[i], arr[j], curr_Sum - arr[j]));
				}
				map.put(arr[j], map.getOrDefault(curr_sum, 0) + 1);
			}

		}
		return list;
	}

	private static List<List<Integer>> threeSum1(int[] arr, int k) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int left = i + 1, right = arr.length - 1;
			int curr_sum;
			while (left < right) {
				curr_sum = arr[i] + arr[left] + arr[right];
				if (curr_sum > 0)
					right--;
				else if (curr_sum < 0)
					left++;
				else {
					list.add(Arrays.asList(arr[i], arr[left], arr[right]));

					while (left < right && arr[right] == arr[right - 1]) right--;
					while ((left < right && arr[left] == arr[left + 1])) left++;
					right--;
					left++;
				}
			}
		}
		return list;
	}
}
