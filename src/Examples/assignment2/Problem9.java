package assignment2;

public class Problem9 {
	public static void main(String args[]){

		int[] nums={0,1,0,12,3};
		int[] moveZeroes = moveZeroes(nums);
	}
	private static int[]  moveZeroes(int[] nums) {
		int  m =nums.length,nonZeroIndex=0;
		int[] dummyArr=new int[m];
		for(int i=0;i<m;i++){
			if(nums[i]!=0){
				dummyArr[nonZeroIndex]=nums[i];
				nonZeroIndex++;
			}

		}
		for(int i=nonZeroIndex;i<m;i++){
			dummyArr[i]=0;
		}
		return dummyArr;

	}

	private static int[] moveZeroes2(int[] nums){
		int m=nums.length,nonZeroIndex=0;
		for (int i=0;i<m;i++){
			if(nums[i]!=0){
				nums[nonZeroIndex]=nums[i];
				nonZeroIndex++;
			}
		}
		for(int i=nonZeroIndex;i<m;i++){
			nums[i]=0;
		}

		return nums;
	}
}
