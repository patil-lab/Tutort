package Examples;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList();
		ll.addFirst(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.addLast(5);

	}


	class Node {
		int data;

		Node(int data) {
			this.data = data;
		}
	}
}
