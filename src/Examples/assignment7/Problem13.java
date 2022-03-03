package assignment7;

public class Problem13 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(3, null);

		ListNode l2 = new ListNode(4, l1);

		ListNode l3 = new ListNode(2, l2);


		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(6, l4);
		ListNode l6 = new ListNode(5, l5);


		ListNode ans = addTwoNumbers(l3, l6);

		System.out.println();
	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummy_head = new ListNode(0);
		ListNode l3 = dummy_head;

		int carry = 0;
		while (l1 != null && l2 != null) {


			int sum = l1.val + l2.val + carry;
			carry = sum / 10;
			int last_digit = sum % 10;
			ListNode newNode = new ListNode(last_digit);
			l3.next = newNode;

			l1 = l1.next;
			l2 = l2.next;
			l3 = l3.next;

		}
		if (carry > 0) {
			ListNode new_node = new ListNode(1);
			l3.next = new_node;
			l3 = l3.next;
		}

		return dummy_head.next;

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
