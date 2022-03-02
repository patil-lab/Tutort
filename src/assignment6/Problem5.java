package assignment6;

public class Problem5 {
	private static void deleteNode(ListNode node) {

		ListNode del = node.next;
		node.val = del.val;
		node.next = del.next;


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
