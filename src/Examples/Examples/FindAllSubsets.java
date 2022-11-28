package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllSubsets {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2};
		List<List<Integer>> subsets = subsets(arr);
		System.out.println();
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i - 1])
				continue;
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}

	public static List<List<Integer>> subsets1(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		res.add(new ArrayList<>());
		for (int num : nums) {
			int n = res.size();
			for (int j = 0; j < n; j++) {
				List<Integer> temp = new ArrayList<>(res.get(j));
				temp.add(num);
				res.add(temp);
			}
		}

		return res;
	}
}

