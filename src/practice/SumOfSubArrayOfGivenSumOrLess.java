package practice;

import java.util.HashMap;
import java.util.Map;

public class SumOfSubArrayOfGivenSumOrLess {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 1, 0, 1};
		int k = 3;
		int list = sumOfSub(arr, 6);
		System.out.println(list);
	}

	private static int sumOfSub(int[] arr, int n) {

		int l = arr.length;
		int count = 0;
		int curr_sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < l; i++) {
			curr_sum += arr[i];
			if (map.containsKey(curr_sum - n))
				count += map.get(curr_sum - n);
			map.put(curr_sum, map.getOrDefault(curr_sum, 0) + 1);

		}
		return count;
	}
}
