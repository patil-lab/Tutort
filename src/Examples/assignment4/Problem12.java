package assignment4;

import java.util.Arrays;

public class Problem12 {


	private final int[] digitPositions = new int[10];

	public static void main(String[] args) {
		int n = 823475321;
		Problem12 problem12 = new Problem12();
		int ans = problem12.nextGreaterElemet(n);
		System.out.println("NGE: " + ans);

	}

	private int nextGreaterElemet(int n) {
		if (n < 10) return -1;
		return findAndCreateNextGreaterElement(convertToCharArray(n));

	}

	private char[] convertToCharArray(int n) {
		return String.valueOf(n).toCharArray();
	}

	private int findAndCreateNextGreaterElement(char[] charArr) {
		int indexToSwap = skipUntilDigitLessThanNext(charArr);
		if (indexToSwap < 0) return -1;
		int digit = Character.getNumericValue(charArr[indexToSwap]);
		int greaterIndex = findGreaterIndex(digit);
		return createNextGreaterNumber(charArr, indexToSwap, greaterIndex);
	}

	private int skipUntilDigitLessThanNext(char[] digits) {
		int index = digits.length - 2;
		while (index >= 0) {
			digitPositions[digits[index + 1] - '0'] = index + 1;
			if (digits[index] < digits[index + 1]) break;
			index--;
		}

		return index;
	}

	private int findGreaterIndex(int digit) {
		for (int i = digit + 1; i < this.digitPositions.length; i++) {
			if (digitPositions[i] > 0) return digitPositions[i];

		}
		return -1;
	}

	private int createNextGreaterNumber(char[] digits, int indexToSwap, int greaterIndex) {
		swap(digits, indexToSwap, greaterIndex);
		Arrays.sort(digits, indexToSwap + 1, digits.length);
		try {
			return Integer.parseInt(new String(digits));
		} catch (NumberFormatException nfe) {
			return -1;
		}

	}

	private void swap(char[] digits, int currentIndex, int replaceIndex) {
		char temp = digits[currentIndex];
		digits[currentIndex] = digits[replaceIndex];
		digits[replaceIndex] = temp;
	}
}
