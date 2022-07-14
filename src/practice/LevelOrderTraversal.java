package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	static List<List<Integer>> levelOrder(Node root) {
		if (root == null) return null;
		Queue<Node> q = new LinkedList<>();
		List<List<Integer>> lisOfList = new ArrayList<>();
		q.add(root);
		int count = 1;
		while (!q.isEmpty()) {
			int temp = count;
			List<Integer> level = new ArrayList<>();
			while (temp > 0) {
				Node current = q.remove();
				level.add(current.data);
				if (current.left != null) {
					count++;
					q.add(current.left);
				}
				if (current.right != null) {
					q.add(current.right);
					count++;
				}

				temp--;
			}


			lisOfList.add(level);

		}

		return lisOfList;
	}

	class Node {
		int data;
		Node left;
		Node right;
	}
}
