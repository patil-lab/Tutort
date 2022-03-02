package assignment6;

public class Problem4 {
	private ListNode returnMiddleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null) {
			if (fast.next == null) {
				return slow;
			} else if (fast.next.next == null) {
				return slow.next;
			}
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
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
