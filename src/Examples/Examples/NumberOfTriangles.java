package Examples;

import java.util.Arrays;

public class NumberOfTriangles {
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 2, 2};
		int[] res = possibleTriangle(arr);
		System.out.println();
	}

	private static int[] possibleTriangle(int[] arr) {
		int n = arr.length;
		if (n < 3)
			return new int[0];
		Arrays.sort(arr);
		int k = 0;
		int[] res = new int[n - 2];
		for (int i = 0; i < n - 2; i++) {
			if (k <= n - 2) {
				if (arr[i] + arr[i + 1] > arr[i + 2]) {
					res[k] = 1;
				} else res[k] = 0;
				k++;
			}
		}
		return res;
	}
}
