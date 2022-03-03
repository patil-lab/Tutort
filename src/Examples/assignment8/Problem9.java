package assignment8;

import java.util.LinkedList;

public class Problem9 {

	private boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) return false;
		LinkedList<TreeNode> nodes = new LinkedList<>();
		LinkedList<Integer> values = new LinkedList<>();
		nodes.add(root);
		values.add(root.val);
		while (!nodes.isEmpty()) {
			TreeNode curr = nodes.poll();
			int sumValue = values.poll();
			if (curr.left == null && curr.right == null && sumValue == targetSum)
				return true;

			if (curr.left != null) {
				nodes.add(curr.left);
				values.add(sumValue + curr.left.val);
			}

			if (curr.right != null) {
				nodes.add((curr.right));
				values.add(sumValue + curr.right.val);
			}
		}

		return false;
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
