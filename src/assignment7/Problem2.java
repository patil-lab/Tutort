package assignment7;

public class Problem2 {

	private static ListNode mergeLists(ListNode l1, ListNode l2) {

		ListNode prehead = new ListNode(-1);
		ListNode tail = prehead;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}

		if (l1 != null) {

			tail.next = l1;
		} else {
			tail.next = l2;
		}

		return prehead.next;

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
