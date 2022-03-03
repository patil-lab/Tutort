package assignment6;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {
	private ListNode removeZeroSumSubLists(ListNode head, int k) {
		ListNode dummy = new ListNode(0, head);
		int sum = 0;
		Map<Integer, ListNode> map = new HashMap<>();
		map.putIfAbsent(0, dummy);
		while (head != null) {


			sum += head.val;
			if (map.containsKey(sum - k)) {
				ListNode prev = map.get(sum - k);
				ListNode start = prev;

				int tempSum = sum;
				sum = sum - k;
				while (prev != head) {
					prev = prev.next;
					tempSum += prev.val;
					if (prev != head) {
						map.remove(tempSum);
					}
					start.next = head.next;
				}
			} else if (!map.containsKey(sum - k)) {
				map.put(sum, head);
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
