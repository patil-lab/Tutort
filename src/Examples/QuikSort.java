package Examples;

import java.util.Random;

public class QuikSort {
	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		quickSort(arr, 0, arr.length - 1);
		System.out.println();
	}

	private static void quickSort(int[] nums, int start, int end) {

		if (start < end) {
			int pIndex = partition(nums, start, end);
			quickSort(nums, start, pIndex - 1);
			quickSort(nums, pIndex + 1, end);
		}

	}

	private static void randomPartition(int[] nums, int start, int end) {
		Random random = new Random();
		int pivot = random.nextInt(end - start) + start;
		int temp = nums[pivot];
		nums[pivot] = nums[end];
		nums[end] = temp;
	}

	private static int partition(int[] nums, int start, int end) {
		randomPartition(nums, start, end);
		int pivot = nums[end];
		int pIndex = start - 1;
		for (int i = start; i < end; i++) {
			if (nums[i] < pivot) {

				pIndex++;
				int temp = nums[pIndex];
				nums[pIndex] = nums[i];
				nums[i] = temp;


			}

		}
		int temp = nums[pIndex + 1];
		nums[pIndex + 1] = nums[end];
		nums[end] = temp;
		return pIndex + 1;
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}


}
