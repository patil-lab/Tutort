package practice;

public class isUnique {

	public static void main(String[] args) {

		System.out.println(solution(100, new int[]{10, 6, 6, 8}, 2));


	}

	public static int solution(int X, int[] B, int Z) {
		// write your code in Java SE 8
		int total = 0;
		for (int b : B) {

			total += b;
		}
		int remainingBytes = X - total;
		int avgTime = total / B.length;
		int ret = -100;
		if (remainingBytes == 0) {
			ret = 0;
		} else if (remainingBytes != 0) {
			ret = (int) Math.ceil(remainingBytes / avgTime);
		} else {
			ret = -1;
		}

		return ret;
	}


}



