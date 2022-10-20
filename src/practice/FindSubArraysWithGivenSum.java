package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindSubArraysWithGivenSum {
	public static List<List<Integer>> list = new ArrayList<>();

	public static void main(String[] args) {
		int[] arr = {1, 7, 4, 3, 2, 1, 5, 1};
		int[] arr1 = {-1, -4, 0, 5, 3, 2, 1};

		//findSubArray(arr);
		findSubArray2(arr, 7);
		list.forEach(System.out::println);

	}

	private static void findSubArray(int[] arr) {
		int n = arr.length;


		int sum = 7;
		for (int i = 0; i < n; i++) {
			int curr_sum = 0;
			for (int j = i; j < n; j++) {
				curr_sum += arr[j];
				if (curr_sum == sum) {
					printSubArray(arr, i, j);
				}
			}

		}

	}

	private static void findSubArray2(int[] arr, int required) {
		int sum = arr[0];
		int start = 0;
		for (int i = 1; i <= arr.length; i++) {
			while (sum > required && start < i - 1) {
				sum = sum - arr[start];
				start++;
			}
			if (sum == required) {
				int p = i - 1;
				printSubArray(arr, start, p);
			}
			if (i < arr.length) {
				sum = sum + arr[i];
			}
		}
	}

	private static void printSubArray(int[] arr, int i, int j) {
		//System.out.println(IntStream.range(i,j+1).mapToObj(k->arr[k]).collect(Collectors.toList()));
		List<Integer> collect = IntStream.range(i, j + 1).mapToObj(k -> arr[k]).collect(Collectors.toList());

		list.add(collect);

	}
}
