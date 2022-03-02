package assignment6;

public class Problem1 {

	private static ListNode removeNthNode(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
		ListNode left = dummy;
		ListNode right = head;

		while (n > 0 && right != null) {
			right = right.next;
			n--;
		}

		while (right != null) {
			right = right.next;
			left = left.next;
		}

		left.next = left.next.next;

		return dummy.next;
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
