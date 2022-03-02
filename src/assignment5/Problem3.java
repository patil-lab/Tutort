package assignment5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> num = dissappearedNumber(nums);
		System.out.println();
	}

	private static List<Integer> dissappearedNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		List<Integer> res = new ArrayList<>();

		for (int i : nums)
			set.add(i);

		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(i + 1))
				res.add(i + 1);
		}

		return res;

	}

}
