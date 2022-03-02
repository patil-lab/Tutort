package assignment7;

import java.util.ArrayList;
import java.util.Stack;

public class Problem5 {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		public static void main(String[] args) {
			ListNode l1 = new ListNode(5, null);

			ListNode l2 = new ListNode(1, l1);

			ListNode l3 = new ListNode(2, l2);

			ListNode l4 = new ListNode(1, l3);

			ListNode l5 = new ListNode(2, l4);

			int[] output = nextGreaterElement(l3);
			System.out.println();
		}

		private static int[] nextGreaterElement(ListNode head) {

			ArrayList<Integer> list = new ArrayList<>();
			ListNode curr = head;
			while (curr != null) {
				list.add(curr.val);
				curr = curr.next;
			}

			int[] output = new int[list.size()];
			Stack<Integer> stack = new Stack<>();
			for (int i = 0; i < list.size(); i++) {
				while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
					output[stack.pop()] = list.get(i);
				}

				stack.push(i);
			}

			return output;
		}
	}
}
