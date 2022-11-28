package Examples;

import java.util.HashMap;
import java.util.Map;

public class Swaps {

	private static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		int[] arr = {0, 2, 1, 3};
		int swap = minSwapsCouples(arr);
		System.out.println(swap);

	}

	public static int minSwapsCouples(int[] tow) {


		for (int i = 0; i < tow.length; i++) {

			map.put(tow[i], i);
		}
		int swap = 0;

		for (int i = 0; i < tow.length; i += 2) {
			int first = tow[i];

			int second = first ^ 1;
			if (tow[i + 1] != second) {
				swap++;
				swap(tow, i + 1, map.get(second));
			}
		}

		return swap;

	}

	private static void swap(int[] tow, int i, int j) {

		int temp = tow[i];
		tow[i] = tow[j];
		tow[j] = temp;

		map.put(tow[i], i);
		map.put(tow[j], j);


	}
}
