package assignment7;

public class Problem14 {

	private static ListNode reverseKGroups(ListNode head, int k) {

		if (head == null)
			return head;
		ListNode curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}

		ListNode temp = head;
		ListNode prev = null, next = null;
		int countK = 0;
		while (countK < k && temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}

		if (next != null)
			head.next = reverseKGroups(next, k);

		return prev;

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
