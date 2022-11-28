package Examples;

import java.util.TreeSet;

public class LIS {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 1, 6};
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i : arr) {
			Integer ceil = ts.ceiling(i);
			if (null != ceil) {
				ts.remove(ceil);
			}
			ts.add(i);
		}

	}
}
