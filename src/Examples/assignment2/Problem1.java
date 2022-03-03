package assignment2;

public class Problem1 {

	public static void main(String args[]){
		int[][] nums;
		nums= new int[][]{{1, 2, 3}, {1, 2, 3}};

		int maximumWealth = maximumWealth(nums);
		System.out.println("maxi wealth : " +maximumWealth);
	}

	public static int maximumWealth(int[][] accounts) {
		int m=accounts.length;
		int[] sum;
		int maxSum=0,richestCustomer=0;
		for(int i=0;i<m;i++){
			int n=accounts[i].length;

			sum=new int[m];
			for(int j=0;j<n;j++){
				sum[i]+=accounts[i][j];
			}

			if(sum[i]>maxSum){
				maxSum=sum[i];
				richestCustomer=i;
			}

		}
		System.out.println("The "+richestCustomer+"nd customer is the richest with a wealth of "+maxSum);

		return maxSum;
	}
}
