package assignment3;

public class Problem3 {

	public static void main(String[] args){
		int[] num1={1,2,3,0,0,0};
		int m=3;
		int[] num2={2,5,6};
		int n=num2.length;
		merge(num1,m,num2,n);
		for (int i=0;i<m+n;i++){
			System.out.print(num1[i]+ "  ");
		}
	}

	private static void merge(int[] nums1,int m,int[] nums2,int n){

		int[] ans=new int[m+n];
		int i=0,j=0,k=0;
		while (i<m && j<n){
			if(nums1[i]<nums2[j]) ans[k++]=nums1[i++];
			else ans[k++]=nums2[j++];
		}
		while (i<m) ans[k++]=nums1[i++];
		while (j<n) ans[k++]=nums2[j++];
		for(int p=0;p<ans.length;p++) nums1[p]=ans[p];
	}
}
