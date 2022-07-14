package practice;

import java.util.Stack;

public class EvaluateNotation {

	public static void main(String[] args) {
		String[] arr = new String[]{"2", "1", "+", "3", "*"};
		int i = evalRPN(arr);
		System.out.println(i);
	}

	private static int evalRPN(String[] arr) {

		Stack<String> stack = new Stack<>();
		int returnValue;
		String operators = "+-*";
		for (String t : arr) {
			if (!operators.contains(t)) {
				stack.push(t);
			} else {

				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (t) {
					case "+":
						stack.push(String.valueOf(a + b));
						break;
					case "-":
						stack.push(String.valueOf(b - a));
						break;
					case "*":
						stack.push(String.valueOf(a * b));
						break;
					case "/":
						stack.push(String.valueOf(b / a));
						break;
				}
			}
		}
		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}
}
