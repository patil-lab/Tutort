package assignment7;

import java.util.LinkedList;

public class Problem1 {

	private void rearrangeLinkedList(ListNode head) {

		ListNode curr = head;
		LinkedList<ListNode> linkedList = new LinkedList<>();
		while (curr != null) {
			linkedList.add(curr);
			curr = curr.next;
		}

		curr = head;
		if (!linkedList.isEmpty()) {
			linkedList.removeFirst();
		}

		boolean removedLast = true;
		while (!linkedList.isEmpty()) {
			ListNode n;
			if (removedLast) {
				n = linkedList.removeLast();
				removedLast = false;
			} else {
				n = linkedList.removeFirst();
				removedLast = true;
			}
			curr.next = n;
			curr = n;
		}
		curr.next = null;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}
	}
}
