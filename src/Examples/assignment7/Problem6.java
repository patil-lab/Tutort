package assignment7;

public class Problem6 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(4, null);

		ListNode l2 = new ListNode(3, l1);

		ListNode l3 = new ListNode(2, l2);

		ListNode l4 = new ListNode(1, l3);


		ListNode output = swapNodesInPairs(l4);
		System.out.println();
	}

	private static ListNode swapNodesInPairs(ListNode head) {

		ListNode curr = head;
		while (curr != null && curr.next != null) {
			int temp = curr.val;
			curr.val = curr.next.val;
			curr.next.val = temp;
			curr = curr.next.next;
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
