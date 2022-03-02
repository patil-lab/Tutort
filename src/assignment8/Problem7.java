package assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem7 {
	private List<Double> avgOfLevels(TreeNode root) {
		List<Double> output = new ArrayList<>();
		if (root == null) return output;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		double level_sum = 0;
		while (!queue.isEmpty()) {

			level_sum = 0;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode cuurentNode = queue.poll();
				level_sum += cuurentNode.val;
				if (cuurentNode.left != null) queue.offer(cuurentNode.left);
				if (cuurentNode.right != null) queue.offer(cuurentNode.right);
			}
			double level_avg = level_sum / size;
			output.add(level_avg);

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
