package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterNumber {
	public static void main(String[] args) {
		ListNode c = new ListNode(5, null);
		ListNode n = new ListNode(3, c);
		ListNode node1x = new ListNode(4, n);
		ListNode node6x = new ListNode(7, node1x);
		ListNode headB = new ListNode(2, node6x);
		nextGrtNumber(headB);
	}

	static int[] nextGrtNumber(ListNode head) {

		List<Integer> list = new ArrayList<>();
		ListNode curr = head;


		while (curr != null) {

			list.add(curr.val);
			curr = curr.next;
		}
		int count = list.size();
		int[] res = new int[count];
		Stack<Integer> st = new Stack<>();
		for (int i = count - 1; i >= 0; i--) {
			while (!st.empty() && list.get(st.peek()) <= list.get(i)) {
				st.pop();
			}
			if (!st.empty()) {
				res[i] = list.get(st.peek());
			}
			st.push(i);
		}

		return res;
	}


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
	}
}
