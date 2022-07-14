package assignment3;

import java.util.Arrays;

public class Problem13 {

	public static void main(String[] args){

		int[] nums={0,0,0};
		int sumClosest = threeSumClosest(nums, 2);
		System.out.println("");

	}

	private static int threeSumClosest(int[] nums,int target){
		int m=nums.length;
		Arrays.sort(nums);
		int res=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<m-2;i++){
			int left = i + 1;
			int right = m - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				int diff=Math.abs(sum-target);
				if(diff==0)
					return sum;
				if(diff<min){
					min=diff;
					res=sum;
				}
				if(sum<target){
					left++;
				}else {
					right--;
				}
			}
		}
		return res;
	}
}
