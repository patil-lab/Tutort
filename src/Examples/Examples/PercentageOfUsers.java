package Examples;

import java.util.ArrayList;
import java.util.List;

public class PercentageOfUsers {

	public static void main(String[] args) {

		int[] arr = {330, 723, 730, 825};
		String[] strings = calculatePercentage(arr);
		System.out.println();

	}

	private static String[] calculatePercentage(int[] arr) {
		int poor = 0, fair = 0, good = 0, excellent = 0, elite = 0;
		for (int i = 0; i < arr.length; i++) {
			if (300 < arr[i] && arr[i] < 599) {
				poor++;
			} else if (600 < arr[i] && arr[i] < 699) {
				fair++;
			} else if (700 < arr[i] && arr[i] < 749) {
				good++;
			} else if (750 < arr[i] && arr[i] < 799) {
				excellent++;
			} else if (800 < arr[i]) {
				elite++;
			}

		}
		String poorStr, fairStr, goodStr, xcelentStr, eliteStr;
		List<String> lis = new ArrayList<>();
		int n = arr.length;
		if (poor > 0) {
			double poorRes = (double) poor * 100 / n;
			poorStr = "Poor: " + String.format("%.2f", poorRes) + "%";
			lis.add(poorStr);
		}
		if (fair > 0) {
			double fairRes = (double) fair * 100 / n;
			fairStr = "Fair: " + String.format("%.2f", fairRes) + "%";
			lis.add(fairStr);
		}

		if (good > 0) {
			double goodRes = (double) good * 100 / n;
			goodStr = "Good: " + String.format("%.2f", goodRes) + "%";
			lis.add(goodStr);
		}
		if (excellent > 0) {
			double excelRes = (double) good * 100 / n;
			xcelentStr = "Excellent: " + String.format("%.2f", excelRes) + "%";
			lis.add(xcelentStr);
		}
		if (elite > 0) {
			double eliteRes = (double) elite * 100 / n;
			eliteStr = "Elite: " + String.format("%.2f", eliteRes) + "%";
			lis.add(eliteStr);
		}

		return lis.toArray(new String[0]);
	}
}
