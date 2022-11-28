package Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllMissingNumbers {

	public static List<Integer> missingNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		HashSet<Integer> numbers = new HashSet<>();
		for (int i : nums) {
			numbers.add(i);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (!numbers.contains(i)) {
				list.add(i);
			}
		}

		return list;
	}
}
