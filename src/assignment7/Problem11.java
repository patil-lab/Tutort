package assignment7;

public class Problem11 {

	private static Node addpoly(Node p1, Node p2) {

		Node start = new Node(0, 0);
		Node s = start;
		while (p1 != null && p2 != null) {
			Node next1 = p1.next;
			Node next2 = p2.next;
			if (p1.pow == p2.pow) {
				p1.coeff = p1.coeff + p2.coeff;
				p1.next = null;
				start.next = p1;
				p1 = next1;
				p2 = next2;
			} else if (p1.pow > p2.pow) {
				start.next = p1;
				p1.next = null;
				p1 = next1;
			} else {
				start.next = p2;
				p2.next = null;
				p2 = next2;
			}
			start = start.next;
			if (p1 == null) {
				start.next = p2;
				break;
			}

			if (p2 == null) {
				start.next = p1;
				break;
			}


		}
		return s.next;
	}

	static class Node {
		int coeff;
		int pow;
		Node next;

		Node(int a, int b) {
			coeff = a;
			pow = b;
			next = null;
		}
	}
}
