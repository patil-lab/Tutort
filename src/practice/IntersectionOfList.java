package practice;

public class IntersectionOfList {

	public static void main(String[] args) {
		ListNode node4 = new ListNode(5, null);
		ListNode node3 = new ListNode(4, node4);
		ListNode node8x = new ListNode(8, node3);
		ListNode node1 = new ListNode(1, node8x);
		ListNode headA = new ListNode(4, node1);


		ListNode node1x = new ListNode(1, node8x);
		ListNode node6x = new ListNode(6, node1x);
		ListNode headB = new ListNode(5, node6x);

		System.out.println(intersection(headA, headB) != null ? intersection(headA, headB).val : null);
	}

	private static ListNode intersection(ListNode headA, ListNode headB) {
		int m = length(headA);
		int n = length(headB);
		int d = Math.abs(m - n);

		if (m > n) {
			for (int i = 0; i < d; i++) {
				headA = headA.next;
			}

		} else {
			for (int i = 0; i < d; i++) {
				headB = headB.next;
			}

		}
		while (headA != null && headB != null) {
			if (headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}

		return null;
	}

	static int length(ListNode A) {
		int count = 0;
		while (A != null) {
			count++;
			A = A.next;
		}
		return count;
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
