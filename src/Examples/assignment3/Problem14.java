package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem14 {

	public static void main(String[] args){

		int[] nums={1,0,-1,0,-2,2};
		int target=0;
		List<List<Integer>> lists=fourSum2(nums,target);
		System.out.println("k");

	}

	private static List<List<Integer>>  fourSum(int[] nums,int target){

		int m=nums.length;
		List<List<Integer>> lists=new ArrayList<>();
		for(int i=0;i<m;i++){
			for(int j=i+1;j<m;j++){

				for(int k=j+1;k<m;k++){
					for(int l=k+1;l<m;l++){
						if(nums[i]+nums[j]+nums[k]+nums[l]==target){
							lists.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

						}
					}
				}
			}

		}

		return lists;
	}

	private static List<List<Integer>> fourSum2(int[] nums,int target){

		int m=nums.length;
		Arrays.sort(nums);
		List<List<Integer>> list=new ArrayList<>();
		for(int i=0;i<m;i++){
			for(int j=i+1;j<m;j++){
				int target2=target-nums[i]-nums[j];

				int left=j+1;
				int right=m-1;
				while (left<right){
					int twoSum=nums[left]+nums[right];
					if(twoSum<target2) left++;
					else if(twoSum>target2) right--;
					else {
						List<Integer> quad=new ArrayList<>();
						quad.add(nums[i]);
						quad.add(nums[j]);
						quad.add(nums[left]);
						quad.add(nums[right]);
						list.add(quad);
						while (left<right && nums[left]==quad.get(2)) left++;
						while (left<right && nums[right]==quad.get(3)) right--;
					}
				}
				while (j+1<m && nums[j+1] ==nums[j] ) ++j;
			}

			while (i+1<m && nums[i+1] == nums[i]) ++i;
		}

		return list;
	}
}
