package assignment7;

public class Problem17 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode lA = headA, lB = headB, ret = null;

		while (lA != lB) {
			lA = lA == null ? headB : lA.next;
			lB = lB == null ? headA : lB.next;
		}

		return lA;
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
