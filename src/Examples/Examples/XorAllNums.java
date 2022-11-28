package Examples;

public class XorAllNums {

	public static void main(String[] args) {
		int[] nums1 = {2, 1, 3};
		int[] nums2 = {10, 2, 5, 0};
		xorAllnums(nums1, nums2);
	}

	private static int xorAllnums(int[] nums1, int[] nums2) {
		int res = 0;
		for (int num : nums1) {
			for (int num1 : nums2) {
				res ^= (num ^ num1);
			}
		}
		System.out.println(res);
		return res;
	}
}
