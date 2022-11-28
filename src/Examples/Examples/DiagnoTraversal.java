package Examples;

public class DiagnoTraversal {

	public static void main(String[] args) {
		int[][] arr = {{2, 3}};
		int[] ans = diagnol(arr);
		System.out.println();
	}

	public static int[] diagnol(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int i = 0;
		int row = 0, col = 0;
		boolean up = true;
		int[] arr = new int[m * n];

		while (row < m && col < n) {
			if (up) {
				while (row > 0 && col < n - 1) {
					arr[i++] = matrix[row][col];
					row--;
					col++;
				}
				arr[i++] = matrix[row][col];
				if (col == n - 1) {
					row++;
				} else {
					col++;
				}

			} else {
				while (col > 0 && row < m - 1) {
					arr[i++] = matrix[row][col];
					row++;
					col--;
				}
				arr[i++] = matrix[row][col];
				if (row == m - 1) {
					col++;
				} else row++;
			}
			up = !up;
		}

		return arr;

	}
}
