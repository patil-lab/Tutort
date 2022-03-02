package assignment2;

public class Problem6 {

	public static void main(String args[]) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		transpose(arr);
	}

	public static int[][] transpose(int[][] arr){

		int m=arr.length;
		int n=arr[0].length;
		int[][] reverse=new int[n][m];
		for (int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				reverse[j][i]=arr[i][j];
			}
		}
		return reverse;
	}
}
