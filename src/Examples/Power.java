package Examples;

public class Power {

	private static int pow(int m, int n) {
		if (n == 0)
			return 1;
		if (n % 2 == 0)
			return pow(m * m, n / 2);
		else
			return pow(m * m, (n - 1) / 2);
	}


	/*private static int heightOfTree(Node root) {

		int lt, rt, h;

		if (root == null)
			return -1;

		lt = heightOfTree(root.left);
		rt = heightOfTree(root.right);

		return h = Math.max(lt, rt);

	}*/


	/*private static int countNodes(Node root){

		if(root==null)
			return  0;

		int lCount,rightCount;

		lCount=countNodes(root.left);
		rightCount=countNodes(root.right);
		return lCount+rightCount+1;
	}*/
}
