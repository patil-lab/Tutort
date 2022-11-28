package Examples;

import java.util.HashMap;
import java.util.Map;

public class MostFrequesntEvenElements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6};
		System.out.println(mostFrequentEven(arr));
	}

	private static int mostFrequentEven(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();
		int ans = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num % 2 == 0) {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i : map.keySet()) {
			if (max < map.get(i)) {
				max = map.get(i);
				ans = i;
			}
		}

		if (ans == Integer.MAX_VALUE) return -1;


		return ans;
	}
}
