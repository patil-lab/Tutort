package practice;


public class Dups2 {

	public static void main(String[] args) {

		ListNode node3 = new ListNode(1, null);
		ListNode node6x = new ListNode(1, node3);
		ListNode headB = new ListNode(2, node6x);
		removeDup(headB);
	}

	static ListNode removeDup(ListNode head) {
		ListNode dummy = new ListNode(0, head);
		ListNode prev = dummy;
		while (head != null) {
			if (head.next != null && head.val == head.next.val) {
				while (head.next != null && head.val == head.next.val) {
					head = head.next;
				}
				prev.next = head.next;
			} else {
				prev = prev.next;
			}
			head = head.next;
		}

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
