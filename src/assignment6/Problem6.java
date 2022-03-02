package assignment6;

public class Problem6 {

	private static ListNode deleteElements(ListNode head, int val) {
		ListNode curr = head, prev = null;
		while (curr != null) {
			if (curr.val == val) {
				if (curr == head) {
					head = head.next;
					curr = head;
				} else {
					prev.next = curr.next;
					curr = curr.next;
				}
			} else {
				prev = curr;
				curr = curr.next;
			}
		}

		return head;

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
