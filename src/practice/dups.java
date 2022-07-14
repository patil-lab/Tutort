package practice;

public class dups {

	public static void main(String[] args) {

		ListNode node3 = new ListNode(1, null);
		ListNode node6x = new ListNode(1, node3);
		ListNode headB = new ListNode(1, node6x);
		removeDup(headB);
	}

	static ListNode removeDup(ListNode head) {
		if (head == null) return head;
		ListNode curr = head;
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val)
				curr.next = curr.next.next;
			else {

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

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
