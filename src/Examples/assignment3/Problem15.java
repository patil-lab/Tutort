package assignment3;

public class Problem15 {

	public static void main(String[] args){
		int[][] nums;
		nums= new int[][]{{1, 2, 3}, {4,5,6},{7,8,9}};
		rotateImage(nums);

	}

	private static void rotateImage(int[][] matrix){

		int n=matrix.length;
		int m=matrix[0].length;

		for (int i=0;i<m;i++){
			for (int j=0;j<n;j++) {
				if (i < j) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}

		//Reverse all elements
		for (int row=0;row<n;row++){
			int i = 0,j=m-1;
			while (i<j){
				int temp = matrix[row][i];
				matrix[row][i] = matrix[row][j];
				matrix[row][j] = temp;
				i++;
				j--;
			}
		}
	}
}
