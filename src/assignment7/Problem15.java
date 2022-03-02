package assignment7;

public class Problem15 {
	public Node copyRandomList(Node head) {
		Node temp = head;
		while (temp != null) {
			Node copy = temp.next;
			Node random = temp.random;
			temp.next = new Node(temp.val, copy, random);
			temp = temp.next.next;
		}

		Node newHead = head.next;
		temp = head;
		while (temp != null) {
			Node copy = temp.next;
			if (copy.random != null) copy.random = copy.random.next;
			temp = copy.next;
		}

		temp = head;
		while (temp != null) {

			Node copy = temp.next;
			temp.next = copy.next;
			if (copy.next != null) copy.next = temp.next.next;
			temp = temp.next;

		}

		return newHead;
	}

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}

		public Node(int val, Node next, Node random) {
			this.val = val;
			this.next = next;
			this.random = random;
		}
	}
}
