package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem11 {
	public static void main(String[] args){

		int[] nums={-1,0,1,2,-1,-4};
		threeSum(nums);
	}

	private static List<List<Integer>> threeSum(int[] nums) {

		int m=nums.length;
		Arrays.sort(nums);
		List<List<Integer>> res=new ArrayList<>();

		for(int i=0;i<m;i++){
			if(i>0 && nums[i]==nums[i-1]){
				continue;
			}
			int left=i+1,right=m-1,target=0-nums[i];
			while (left<right){
				int sum=nums[left]+nums[right];
				if(sum>target){
					right--;
				}else if(sum<target){
					left++;
				}else {
					res.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while (left<right && nums[left]==nums[left+1])left++;
					while (left<right && nums[right]==nums[right-1])right++;
					right--;
					left++;
				}

			}

		}



		return res;

	}


}
