package assignment7;

public class Problem7 {


	private static ListNode rotateList(ListNode head, int k) {

		ListNode tail = head;
		int length = 0;
		while (tail.next != null) {
			length += 1;
			tail = tail.next;

		}

		k = k % length;
		if (k == 0) return head;

		ListNode curr = head;
		for (int i = 0; i >= length - k - 1; i++) {
			curr = curr.next;
		}
		ListNode newHead = curr.next;
		curr.next = null;
		tail.next = head;

		return newHead;
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
