package assignment4;

public class Problem6 {
	int[][] matrix;

	Problem6(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				matrix[i][j] += matrix[i][j - 1];
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] += matrix[i - 1][j];
			}
		}
		this.matrix = matrix;
	}

	public static void main(String[] args) {
		int[][] nums = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
		Problem6 obj = new Problem6(nums);
		int param = obj.sumRegion(1, 1, 2, 2);
		System.out.println(param);
	}

	private int sumRegion(int row1, int col1, int row2, int col2) {
		int total = matrix[row2][col2];
		int extra = (row1 != 0 ? matrix[row1 - 1][col2] : 0) + (col1 != 0 ? matrix[row2][col1 - 1] : 0) - ((row1 != 0 && col1 != 0) ? matrix[row1 - 1][col1 - 1] : 0);

		return total - extra;
	}
}
