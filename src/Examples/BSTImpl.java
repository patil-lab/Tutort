package Examples;

import java.util.Deque;
import java.util.LinkedList;


public class BSTImpl {

	public static void main(String[] args) {
		BSTImpl bst = new BSTImpl();
		BstNode root = null;
		root = bst.insert(root, 25);
		root = bst.insert(root, 15);
		root = bst.insert(root, 12);
		root = bst.insert(root, 28);
		root = bst.insert(root, 26);
		root = bst.insert(root, 29);


		BstNode delet = bst.delete(root, 28);
		BstNode minRoot = bst.findMinInRightTree(root.right);
		boolean pre = bst.search(root, 15);
		int min = bst.findMin(root);
		int max = bst.findMax(root);
		int h = bst.findHeight(root);
		boolean isBst = bst.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		//bst.levelOrderTraversal(root);
		bst.inOrderTraversal(root);
		System.out.println("Present: " + pre + " Min: " + min + " Max: " + max + " isBst : " + isBst);
	}

	private BstNode createNewNode(int data) {

		BstNode root = new BstNode();
		root.data = data;
		root.left = null;
		root.right = null;
		return root;
	}

	public BstNode insert(BstNode root, int data) {
		if (root == null) {
			root = createNewNode(data);
		} else if (data <= root.data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}


		return root;
	}

	public boolean search(BstNode root, int data) {
		if (root == null) return false;
		else if (root.data == data) return true;
		else if (root.data < data) return search(root.right, data);
		else return search(root.left, data);
	}

	private int findMin(BstNode root) {
		if (root == null) return -1;
		else if (root.left != null) {
			root = root.left;
		}

		return root.data;
	}

	public int findMax(BstNode root) {
		if (root == null) return -1;
		else if (root.right != null) root = root.right;

		return root.data;
	}

	private int findHeight(BstNode root) {
		if (root == null)
			return -1;
		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}

	private void levelOrderTraversal(BstNode root) {
		if (root == null) return;
		Deque<BstNode> qu = new LinkedList<>();
		qu.push(root);
		while (!qu.isEmpty()) {
			BstNode curr = qu.poll();
			System.out.println(curr.data);
			if (curr.left != null) qu.push(curr.left);
			if (curr.right != null) qu.push(curr.right);

		}
	}

	private void preOrderTraversal(BstNode root) {
		if (root == null) return;
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	private void postOrderTraversal(BstNode root) {
		if (root == null) return;

		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data);
	}

	private void inOrderTraversal(BstNode root) {
		if (root == null) return;

		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);

	}

	private boolean isBST(BstNode root, int minValue, int maxValue) {
		if (root == null) return true;

		return root.data > minValue && root.data < maxValue && isBST(root.left, minValue, root.data) && isBST(root.right, root.data, maxValue);

	}

	private boolean isSubTreeGreater(BstNode root, int data) {
		if (root == null) return true;
		return root.data > data && isSubTreeGreater(root.left, data) && isSubTreeGreater(root.right, data);

	}

	private boolean isSubTreeLesser(BstNode root, int data) {
		if (root == null) return true;
		return root.data <= data && isSubTreeLesser(root.left, data) && isSubTreeLesser(root.right, data);
	}

	public BstNode delete(BstNode root, int data) {
		if (root == null) return root;
		else if (data < root.data) root.left = delete(root.left, data);
		else if (data > root.data) root.right = delete(root.right, data);
		else {
			if (root.left == null && root.right == null) {

				root = null;
				return root;
			} else if (root.left == null) {
				BstNode temp = root;
				root = root.right;
				temp = null;

			} else if (root.right == null) {
				BstNode temp = root;
				root = root.left;
				temp = null;

			} else {
				BstNode temp = findMinInRightTree(root.right);
				root.data = temp.data;
				root.right = delete(root.right, temp.data);
			}
		}
		return root;
	}

	private BstNode findMinInRightTree(BstNode root) {

		if (root == null) {
			return null;
		}
		while (root.left != null)
			root = root.left;

		return root;
	}

	public class BstNode {
		int data;
		BstNode left;
		BstNode right;
	}

}
