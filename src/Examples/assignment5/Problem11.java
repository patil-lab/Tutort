package assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem11 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
		int arr = singleNumber(nums);
		System.out.println();
	}

	private static int singleNumber3(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int number = -1;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);

		}
		for (int num : nums) {
			if (map.get(num).equals(1)) {
				number = num;
			}
		}

		return number;

	}

	//bit manipulation solution

	private static int singleNumber(int[] nums) {
		int result = 0;
		List<Integer> list = new ArrayList<>();
		for (int num : nums) {
			list.add(num);
		}

		// From 0 to Integer.SIZE (32)
		int bitPosition = 1;
		for (int i = 0; i < Integer.SIZE; i++) {
			int count = 0;

			// For each element
			for (int j = 0; j < list.size(); j++) {
				// Current element AND bitPosition
				if ((list.get(j) & bitPosition) != 0) {
					count++;
				}
			}

			// If the result modulo 3 is different from 0
			// It means this bit appeared only once
			// So we have to store it
			if (count % 3 != 0) {
				result |= bitPosition;
			}

			// Shift the bit to the left
			bitPosition <<= 1;
		}

		return result;
	}
}
