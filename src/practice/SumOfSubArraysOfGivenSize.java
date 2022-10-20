package practice;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubArraysOfGivenSize {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 0, 1};
		int k = 3;
		List<Integer> list = sumOfSubArrayGivenSize(arr, k);
		for (int i : list) {
			System.out.println(i);
		}


	}

	private static List<Integer> sumOfSubArrayGivenSize(int[] arr, int k) {
		int sum = 0;


		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < k; i++)
			sum += arr[i];


		list.add(sum);

		for (int i = k; i < arr.length; i++) {


			sum = (sum - arr[i - k]) + arr[i];


			list.add(sum);
		}

		return list;
	}
}
