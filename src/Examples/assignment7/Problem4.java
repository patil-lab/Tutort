package assignment7;

public class Problem4 {
	public Problem3.ListNode detectCycle(Problem3.ListNode head) {
		if (head == null || head.next == null) return null;
		Problem3.ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		if (fast == null || fast.next == null) return null;

		fast = head;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}

		return fast;
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
