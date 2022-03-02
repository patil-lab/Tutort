package assignment5;

public class Problem7 {

	public static void main(String[] args) {
		int[] nums = {1, 0, 0, 0, 1, 0, 0};
		int n = 2;
		boolean fits = canPlaceFlowers(nums, n);
		System.out.println();
	}

	private static boolean canPlaceFlowers(int[] flowerbed, int n) {

		int l = flowerbed.length;

		for (int i = 0; i < l; i++) {
			if (flowerbed[i] == 0) {
				int prev = (i == 0) ? 0 : flowerbed[i - 1];
				int next = (i == l - 1) ? 0 : flowerbed[i + 1];

				if (prev == 0 && next == 0) {

					flowerbed[i] = 1;
					n--;
				}
			}
			if (n <= 0) {
				return true;
			}
		}


		return false;
	}
}
