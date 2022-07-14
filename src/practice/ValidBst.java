package practice;

public class ValidBst {

	public static void main(String[] args) {


		TreeNode left = new TreeNode(6, null, null);

		TreeNode right = new TreeNode(8, null, null);
		TreeNode tree = new TreeNode(0, null, null);

		System.out.println(helper1(tree, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	static boolean helper1(TreeNode root, Integer min, Integer max) {
		if (root == null) return true;
		if (root.val > min && root.val < max && helper1(root.left, min, root.val) && helper1(root.right, root.val, max))
			return true;
		else
			return false;
	}

	public static boolean helper(TreeNode root, long max, long min) {
		if (root == null) return true;
		if (root.val <= min || root.val >= max) return false;
		return helper(root.left, root.val, min) && helper(root.right, max, root.val);
	}

	public static boolean isValidBST(TreeNode root) {
		if (root == null) return false;
		int max = max(root.left);
		int min = min(root.right);
		if (max <= root.val && min >= root.val) {
			return true;
		}
		return false;
	}

	public static int max(TreeNode root) {//To find maximum value node

		if (root.right != null) {
			return max(root.right);
		} else {
			return root.val;
		}

	}

	public static int min(TreeNode root) {
		if (root.left != null) {
			return min(root.left);
		} else {
			return root.val;
		}
	}

	public static class TreeNode {
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
