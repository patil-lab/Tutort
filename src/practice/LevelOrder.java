package practice;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	static void levelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);


		while (!q.isEmpty()) {
			Node curr = q.poll();
			if (curr == null) {

			} else {
				if (curr.left != null) {
					q.add(curr.left);

				}

				if (curr.right != null) {
					q.add(curr.right);
				}

				System.out.print(curr.data + "  ");

			}

		}


	}

	public static void main(String[] args) {
		Node root = new Node('F');
		root.left = new Node('D');
		root.right = new Node('J');
		root.left.left = new Node('B');
		root.left.right = new Node('E');
		root.right.left = new Node('G');
		root.right.right = new Node('K');
		levelOrder(root);
	}

	static class Node {
		char data;
		Node left;
		Node right;

		Node(char data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
}
