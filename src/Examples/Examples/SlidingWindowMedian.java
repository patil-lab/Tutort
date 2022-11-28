package Examples;

import java.util.PriorityQueue;
import java.util.Queue;

public class SlidingWindowMedian {
	private static Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
	private static Queue<Integer> minHeap = new PriorityQueue<>();

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 3, 1, 4, 2};
		int k = 3;
		double[] doubles = medianSlidingWindow(arr, k);
		System.out.println();
	}

	private static double[] medianSlidingWindow(int[] arr, int k) {
		int n = arr.length - k + 1;
		if (n <= 0)
			return new double[0];
		double[] result = new double[n];

		for (int i = 0; i <= arr.length; i++) {

			if (i >= k) {
				result[i - k] = getMedian();
				remove(arr[i - k]);
			}
			if (i < arr.length) {
				addNum(arr[i]);
			}

		}

		return result;
	}

	public static void addNum(int num) {
		if (num > getMedian()) {
			minHeap.add(num);
		} else {
			maxHeap.add(num);
		}
		rebalance();
	}

	private static void rebalance() {
		if (minHeap.size() + 1 < maxHeap.size()) {
			Integer element = maxHeap.poll();
			minHeap.add(element);
		} else if (maxHeap.size() < minHeap.size()) {
			Integer element = minHeap.poll();
			maxHeap.add(element);

		}
	}

	private static double getMedian() {

		if (minHeap.isEmpty() && maxHeap.isEmpty()) {
			return 0;
		}
		if (minHeap.size() == maxHeap.size()) {
			return ((double) minHeap.peek() + (double) maxHeap.peek()) / 2.0;
		}
		return (double) maxHeap.peek();
	}

	private static void remove(int num) {
		if (num > getMedian()) {
			minHeap.remove(num);
		} else maxHeap.remove(num);
		rebalance();
	}
}
