package Examples;

public class SwapNodes {

	public static void main(String[] args) {

		ListNode root = null;
		SwapNodes swapNodes = new SwapNodes();
		for (int i = 0; i < 5; i++) {
			root = swapNodes.insertNode(root, i);
		}
		swapNodes.swapNodes2(root, 2);
	}

	public ListNode swapNodes(ListNode head, int k) {
		ListNode curr = head;

		int l = 0;
		while (curr != null) {
			l++;
			curr = curr.next;
		}
		int[] arr = new int[l];
		ListNode curr1 = head;
		int index = 0;
		while (curr1 != null) {
			arr[index++] = curr1.val;
			curr1 = curr1.next;
		}

		int temp = arr[l - k];
		arr[l - k] = arr[k - 1];
		arr[k - 1] = temp;
		ListNode root = null;
		for (int i = 0; i < l; i++) {
			root = insertNode(root, arr[i]);
		}
		return root;

	}

	public ListNode swapNodes2(ListNode head, int k) {
		if (head == null || head.next == null) return head;

		ListNode fast = head;
		ListNode slow = head;
		ListNode kNode;
		ListNode prev = null;

		for (int i = 0; i <= k; i++)
			fast = fast.next;

		kNode = fast;

		while (fast != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next;
		}

		int temp = kNode.val;
		kNode.val = prev.val;
		prev.val = temp;

		return head;
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
