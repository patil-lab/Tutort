package assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem6 {


	private List<List<Integer>> pringZigZag(TreeNode root) {
		List<List<Integer>> output = new ArrayList<>();
		if (root == null) return new ArrayList<>();
		Stack<TreeNode> parent = new Stack<>();
		Stack<TreeNode> child = new Stack<>();
		parent.add(root);
		boolean leftToRight = true;

		List<Integer> level = new ArrayList<>();
		while (!parent.isEmpty()) {

			TreeNode node = parent.pop();
			level.add(node.val);

			if (leftToRight) {
				if (node.left != null) {
					child.push(node.left);

				}
				if (node.right != null) {
					child.push(node.right);
				}
			} else {
				if (node.right != null) {
					child.push(node.right);

				}
				if (node.left != null) {
					child.push(node.left);
				}
			}

			if (parent.isEmpty()) {
				leftToRight = !leftToRight;
				parent = child;
				child = new Stack<>();
				output.add(level);
				level = new ArrayList<>();

			}

		}


		return output;
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
