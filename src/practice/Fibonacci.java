package practice;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static Map<Integer, Integer> map = new HashMap<>();


	public static void main(String[] args) {

		System.out.println(fib(5));
		System.out.println(fib2(5));
	}

	public static int fib(int n) {
		int result;
		if (map.containsKey(n)) result = map.get(n);
		else if (n == 2 || n == 1) result = 1;
		else {
			result = fib(n - 1) + fib(n - 2);
			map.put(n, result);

		}

		return result;


	}

	static int fib2(int n) {
		if (n <= 1)
			return n;
		return fib2(n - 1) + fib2(n - 2);
	}
}
