package assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem1 {

	private List postTraversal(TreeNode root) {

		List list = new ArrayList();
		Stack<TreeNode> stk1 = new Stack<>();
		Stack<TreeNode> stk2 = new Stack<>();
		stk1.push(root);
		while (!stk1.isEmpty()) {
			root = stk1.pop();
			stk2.push(root);
			if (root.left != null) stk2.push(root.left);
			if (root.right != null) stk2.push(root.right);

		}
		while (!stk2.isEmpty()) {
			list.add(stk2.pop().val);
		}

		return list;
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
