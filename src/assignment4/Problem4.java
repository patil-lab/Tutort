package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {

	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 3, 4, 5, 7};
		List<String> list = summaryRanges(nums);
		System.out.println("");
	}

	public static List<String> summaryRanges(int[] nums) {
		int m = nums.length;
		List<String> list = new ArrayList<>();
		if (m == 0) return list;
		int x = nums[0];
		for (int i = 0; i < m; i++) {
			if (i == m - 1 || nums[i] + 1 != nums[i + 1]) {
				if (nums[i] != x) list.add(x + "->" + nums[i]);
				else list.add("" + x);
				if (i != m - 1) x = nums[i + 1];
			}
		}
		return list;
	}
}
