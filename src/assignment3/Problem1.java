package assignment3;

import java.util.HashMap;

public class Problem1 {
	public static void main(String args[]){
		int[] nums={1,4,6,8};
		int[] ints = twoSum(nums, 5);
		for(int i=0;i<2;i++){
			System.out.println(ints[i]);
		}
	}

	private static int[] twoSum(int[] nums,int target){
		int m=nums.length;
		int[] indexes=new int[2];
		for(int i=0;i<m-1;i++){
			if(nums[i]+nums[i+1]==target){
				indexes[0]=i;indexes[1]=i+1;
			}
		}
		return indexes;
	}

	private static int[] twoSum2(int[] nums,int target){

		int m=nums.length;
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		int[] indexes=new int[2];

		for(int i=0;i<m;i++){
			if(hashMap.containsKey(nums[i])){
				indexes[0]=hashMap.get(nums[i]);
				indexes[1]=i
;			}else {
				hashMap.put(target-nums[i],i);
			}
		}


		return indexes;
	}
}
