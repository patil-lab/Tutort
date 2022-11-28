package assignment8;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

	public static void main(String[] args) {

		TreeNode left1 = new TreeNode(4);
		TreeNode right1 = new TreeNode(5);
		TreeNode left2 = new TreeNode(1);
		TreeNode right2 = new TreeNode(3);
		TreeNode left = new TreeNode(2, left1, right1);
		TreeNode right = new TreeNode(3, left2, right2);
		TreeNode root = new TreeNode(1, left, right);
		List<List<Integer>> lists = pathSum(root, 7);
		System.out.println();

	}

	private static List<List<Integer>> pathSum(TreeNode root, int targetSum) {


		List<List<Integer>> paths = new ArrayList<>();
		findPathSum(root, targetSum, paths, new ArrayList<>());
		return paths;

	}

	private static void findPathSum(TreeNode root, int targetSum, List<List<Integer>> paths, List<Integer> current) {
		if (root == null) return;
		current.add(root.val);
		if (root.left == null && root.right == null && root.val == targetSum) {
			paths.add(current);
			return;
		}

		findPathSum(root.left, targetSum - root.val, paths, new ArrayList<Integer>(current));
		findPathSum(root.right, targetSum - root.val, paths, new ArrayList<Integer>(current));
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
