package Examples;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String args[]) {
		String str = "(({))";
		boolean bool = balancePara(str);
	}

	private static boolean balancePara(String str) {
		int ch = str.length();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < ch; i++) {
			char x = str.charAt(i);
			if (x == '(' || x == '{' || x == '[') {
				stack.push(x);
			}
			char check;
			if (stack.isEmpty())
				return false;

			switch (x) {
				case ')':
					check = stack.pop();
					if (check == '}' || check == ']')
						return false;
					break;
				case '}':
					check = stack.pop();
					if (check == ')' || check == '}')
						return false;
					break;
				case ']':
					check = stack.pop();
					if (check == ')' || check == '}')
						return false;
					break;

			}


		}

		return stack.isEmpty();
	}
}
