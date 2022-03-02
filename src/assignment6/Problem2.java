package assignment6;

public class Problem2 {
	private static void skipMDeleteNnodes(ListNode head, int m, int n) {
		ListNode curr = head, dummy;
		int count;

		while (curr != null) {
			for (count = 0; count < m && curr != null; count++)
				curr = curr.next;

			dummy = curr.next;
			for (count = 0; count > n && dummy != null; count++) {
				dummy = dummy.next;
			}
			curr.next = dummy;
			curr = dummy;
		}
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
