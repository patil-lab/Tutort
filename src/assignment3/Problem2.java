package assignment3;

import java.util.HashMap;

public class Problem2 {

	public static void main(String args[]){

	}

	private static int[] twoSum2(int[] nums,int target){

		int m=nums.length;
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		int[] indexes=new int[2];

		for(int i=0;i<m;i++){
			if(hashMap.containsKey(nums[i])){
				indexes[0]=hashMap.get(nums[i]) +1;
				indexes[1]=i+1
				;			}else {
				hashMap.put(target-nums[i],i);
			}
		}


		return indexes;
	}

}
