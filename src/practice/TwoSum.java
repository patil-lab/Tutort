package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {2, 1, 2, 2};
		twoPointerTwoSum(arr, 4);
	}

	private static List<List<Integer>> twoSum(int[] arr, int target) {
		Arrays.sort(arr);
		int l = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < l; i++) {

			if (map.containsKey(target - arr[i]))
				list.add(Arrays.asList(arr[map.get(target - arr[i])], arr[i]));
			map.put(arr[i], i);
		}
		return list;
	}

	private static int[] twoSum2(int[] arr, int target) {
		int l = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		int[] ans = new int[2];
		for (int i = 0; i < l; i++) {

			if (map.containsKey(target - arr[i])) {
				ans[0] = map.get(target - arr[i]);
				ans[1] = i;
			}
			map.put(arr[i], i);
		}
		return ans;
	}

	private static int[] twoPointerTwoSum(int[] arr, int target) {
		int l = arr.length;
		int left = 0;
		int right = l - 1;
		int curr_sum;
		int[] ans = new int[2];
		while (left < right) {
			curr_sum = arr[right] + arr[left];
			if (curr_sum > target) right--;
			else if (curr_sum < target) left++;
			else {
				ans[0] = left + 1;
				ans[1] = right + 1;
				return ans;
			}
		}

		return ans;
	}
}
