package assignment5;

public class Problem13 {

	public static void main(String[] args) {
		String n1 = "12";
		String n2 = "12";
		String n3 = multiply(n1, n2);
		System.out.println(n3);
	}

	private static String multiply(String num1, String num2) {

		if (num1.equals(0) || num2.equals(0)) {
			return "0";
		}
		int l1 = num1.length();
		int l2 = num2.length();

		int[] res = new int[l1 + l2];


		for (int i = l1 - 1; i >= 0; --i) {
			for (int j = l2 - 1; j >= 0; --j) {
				int digit = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int sum = res[i + j + 1] + digit;
				res[i + j] += sum / 10;
				res[i + j + 1] = sum % 10;
			}

		}
		StringBuilder sb = new StringBuilder();
		for (int val : res) {
			if (sb.length() != 0 || val != 0)
				sb.append(val);
		}

		return sb.length() == 0 ? "0" : sb.toString();
	}
}
