package assignment8;

public class Problem8 {
	private int diameter(TreeNode root) {
		if (root == null)
			return 0;

		int lheight = height(root.left);
		int rheight = height(root.right);

		int lhs = diameter(root.left);
		int rhs = diameter(root.right);


		return Math.max(lheight + rheight, Math.max(lhs, rhs));
	}

	private int height(TreeNode root) {
		if (root == null) return 0;
		int lheight = height(root.left);
		int rheight = height(root.right);
		int h;
		if (lheight > rheight) {
			h = 1 + lheight;
		} else {
			h = 1 + rheight;
		}

		return h;

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