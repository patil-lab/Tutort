package Examples;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {2, 4, 1, 6, 8, 5, 3, 7};
		int[] sortedArr = mergeSort(arr);
		System.out.println();
	}

	private static int[] mergeSort(int[] A) {

		int l = A.length;
		if (l < 2) return A;
		int mid = l / 2;
		int[] L = new int[mid];
		int[] R = new int[l - mid];
		for (int i = 0; i <= mid - 1; i++) {
			L[i] = A[i];
		}
		for (int i = mid; i <= l - 1; i++) {
			R[i - mid] = A[i];
		}
		int[] left = mergeSort(L);
		int[] right = mergeSort(R);
		return merge(left, right, A);


	}

	private static int[] merge(int[] L, int[] R, int[] A) {

		int nL = L.length;
		int nR = R.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (L[i] < R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			A[k] = L[i];
			i++;
			k++;
		}
		while (j < nR) {
			A[k] = R[j];
			j++;
			k++;
		}
		return A;
	}
}
