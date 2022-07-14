package practice;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int k = 3;

		if (k > arr.length)
			k = k % arr.length;
		int[] result = new int[arr.length];

		for (int i = 0; i < k; i++)
			result[i] = arr[arr.length - k + i];

		int j = 0;
		for (int i = k; i < arr.length; i++) {
			result[i] = arr[j];
			j++;
		}

		System.arraycopy(result, 0, arr, 0, arr.length);

	}
}
