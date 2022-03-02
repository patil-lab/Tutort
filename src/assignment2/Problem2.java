package assignment2;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args){
		int[] nums;
		nums= new int[]{1, 2, 3};

		int[] res=runningSum(nums);
		System.out.println(Arrays.toString(res));

	}

	public static int[] runningSum(int[] nums) {
		int m=nums.length;
		int[] sum=new int[m];
		for(int i=0;i<=m-1;i++){
			for(int j=0;j<=i;j++){
				sum[i]+=nums[j];
			}
		}

		return sum;
	}
}
