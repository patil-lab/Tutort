package practice;

public class RemoveAllDups {
	public static void main(String[] args) {
		ListNode node4 = new ListNode(4, null);
		ListNode node3 = new ListNode(3, node4);
		ListNode node6x = new ListNode(1, node3);
		ListNode headB = new ListNode(2, node6x);
		oddEven(headB);
	}

	static ListNode oddEven(ListNode head) {
		if (head == null) return head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}

		odd.next = evenHead;

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
