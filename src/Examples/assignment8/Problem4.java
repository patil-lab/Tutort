package assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem4 {

	private List<List<Integer>> levelOrderTraversal(TreeNode root) {

		if (root == null) return new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<List<Integer>> l = new ArrayList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode temp = q.poll();
				al.add(temp.val);
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);

			}
			l.add(al);
		}

		return l;


	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
