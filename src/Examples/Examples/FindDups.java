package Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FindDups {

	public static void main(String[] args) {

		int[] nums = {1, 1};
		int[] n = findErrorNums(nums);
		System.out.println();
	}

	public static int[] findDups(int[] nums) {

		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}

		}
		for (Map.Entry<Integer, Integer> en : map.entrySet()) {
			if (en.getValue() > 1) {
				list.add(en.getKey());
			}
		}
		int[] arr = new int[list.size()];

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int[] findErrorNums(int[] nums) {
		int dup = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int n : nums) {
			if (set.contains(n))
				dup = n;
			set.add(n);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (!set.contains(i))
				return new int[]{dup, i};
		}

		return new int[]{};

	}
}
