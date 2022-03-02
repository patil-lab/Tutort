package assignment5;

public class Problem14 {

	static int[][] win = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

	public static void main(String[] args) {
		char board[] = {'x', 'x', 'o',
				'o', 'o', 'x',
				'x', 'o', 'x'
		};

		boolean isvalid = isValid(board);
		System.out.println(isvalid);

	}

	static boolean isWin(char[] board, char c) {
		for (int i = 0; i < 8; i++)
			if (board[win[i][0]] == c &&
					board[win[i][1]] == c &&
					board[win[i][2]] == c)
				return true;

		return false;
	}

	static boolean isValid(char[] board) {
		int xCount = 0, oCount = 0;
		for (int i = 0; i < 8; i++) {
			if (board[i] == 'x') xCount++;
			if (board[i] == 'o') oCount++;

		}

		if (xCount == oCount || xCount == oCount + 1) {
			if (isWin(board, 'o')) {
				if (isWin(board, 'x'))
					return false;

				return xCount == oCount;
			}

			if (isWin(board, 'x') && xCount != oCount + 1) return false;

			return true;
		}

		return false;
	}
}
