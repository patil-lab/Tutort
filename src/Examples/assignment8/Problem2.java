package assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem2 {

	private List<Integer> inOrderTraversal(TreeNode root) {

		List list = new ArrayList<>();
		Stack<TreeNode> stk = new Stack<>();
		TreeNode p = root;
		while (true) {
			if (p != null) {
				stk.push(p);
				p = p.left;
			} else {
				if (stk.isEmpty()) {
					break;
				} else {
					p = stk.pop();
					list.add(p.val);
					p = p.right;
				}
			}
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
