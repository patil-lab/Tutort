package Examples;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
	public static void main(String[] args){

		int[] nums={2,7,11,15};
		int[] ints = twoSum(nums, 9);
		System.out.println("");
	}

	public static int[] twoSum(int[] nums, int target) {
		if(nums==null)
			return new int[0];
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			Integer idx = map.get(nums[i]);
			if(idx!=null) {
				return new int[]{idx+1,i+1};
			}
			else {
				map.put(target-nums[i],i);
			}
		}
		return new int[0];
	}
}
