package assignment2;

import java.util.HashMap;

public class Problem7 {

	public static void main(String args[]){

		int[] arr = {3, 2, 3};
		majorityElement(arr);
	}

	private static int majorityElement(int[] nums) {
		int m=nums.length;
		int maxElement=nums[0];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<m;i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i],(map.get(nums[i])+1));
			}else{
				map.put(nums[i],1);

			}
		}
		for(int i=0;i<m;i++){
			if(map.get(nums[i])>maxElement){
				maxElement=nums[i];
			}



		}
		return maxElement;
	}
}
