package Examples;

public class RverseBetween {

	public static void main(String[] args) {
		int n = 29;
		System.out.println(n % 10);
		System.out.println(n / 10);
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println(sum);

	}
}
