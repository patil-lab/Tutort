package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem12 {

	public static void main(String[] args){

		int[] nums={-2, 0, 1, 3};
		List<List<Integer>> lists = threeSumSmaller(nums, 2);
		System.out.println("j");

	}

	private static List<List<Integer>> threeSumSmaller(int[] nums,int target){
		int m=nums.length;
		Arrays.sort(nums);
		List<List<Integer>> list=new ArrayList<>();
		for(int i=0;i<m;i++){
			int start=i+1,end=m-1;
			while (start<end){
				int sum=nums[i]+nums[start]+nums[end];
				if(sum<target){
					list.add(Arrays.asList(nums[i],nums[start],nums[end]));
					start++;
				}else {
					end--;
				}
			}
		}
		return list;
	}
}
