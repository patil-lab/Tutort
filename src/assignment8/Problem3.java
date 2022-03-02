package assignment8;

public class Problem3 {

	private int minDepth = Integer.MAX_VALUE;

	private int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		dfs(root, 0);
		return minDepth;
	}

	private void dfs(TreeNode root, int level) {
		if (root != null) {
			level += 1;
			if (root.left == null && root.right == null && level < minDepth)
				minDepth = level;
			dfs(root.left, level);
			dfs(root.right, level);
		}
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
