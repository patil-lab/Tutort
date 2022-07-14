package practice;

public class Rotate {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(4, null);
		ListNode node = new ListNode(3, node1);
		ListNode node6x = new ListNode(2, node);
		ListNode headB = new ListNode(1, node6x);
		rotate(headB, 2);
	}

	static ListNode rotate(ListNode head, int k) {

		if (head == null || k == 0) return head;
		ListNode curr = head, newHead;
		int l = 0;
		while (curr != null) {
			l++;
			curr = curr.next;
		}
		k = k % l;
		curr = head;
		int count = 1;
		while (curr != null && count < k) {

			curr = curr.next;
			count++;
		}
		if (curr == null)
			return null;
		newHead = curr.next;
		curr.next = null;
		curr = newHead;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = head;

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
