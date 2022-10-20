package practice;

public class MaxConsecOnes {
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1};
		int num = longestOnes(arr, 2);
		System.out.println(num);
	}

	private static int longestOnes(int[] A, int k) {
		int fast = 0;
		int slow = 0;
		while (fast < A.length) {
			if (A[fast] == 0) k--;
			if (k < 0) {
				if (A[slow] == 0) {
					k++;
				}
				slow++;
			}
			fast++;
		}
		return fast - slow;
	}
}
