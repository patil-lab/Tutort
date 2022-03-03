package Examples;

public class SwapPairwise {

	public static void main(String[] args) {
		ListNode root = null;
		SwapPairwise swapPairwise = new SwapPairwise();
		for (int i = 0; i < 5; i++) {
			root = swapPairwise.insertNode(root, i);
		}
		swapPairwise.swapPairwise(root, 2);
	}

	ListNode swapPairwise(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		int count = 0;

		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if (next != null) {
			head.next = swapPairwise(next, k);
		}


		return prev;
	}

	ListNode insertNode(ListNode root, int item) {
		ListNode temp = new ListNode();
		ListNode temp1;
		temp.val = item;
		temp.next = null;

		if (root == null) {
			root = temp;
		} else {
			temp1 = root;
			while (temp1.next != null)
				temp1 = temp1.next;
			temp1.next = temp;
		}

		return root;

	}

	public class ListNode {
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
