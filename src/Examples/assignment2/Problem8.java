package assignment2;

import java.util.HashMap;

public class Problem8 {

	public static void main(String args[]){
		int max=5;
		int[] nums={1,1,2,2,4,4,5,5,5,5};
		System.out.println(checkMajorityElemOrNot(max,nums));
	}

	private static boolean checkMajorityElemOrNot(int max,int[] nums){
		int m=nums.length,maxElement=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<m;i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i],map.get(nums[i])+1);
			}else {
				map.put(nums[i],1);
			}
		}
		for(int i=0;i<m;i++){
			if(nums[i]>maxElement){
				maxElement=nums[i];
			}
		}

			return max==maxElement;


	}
}
