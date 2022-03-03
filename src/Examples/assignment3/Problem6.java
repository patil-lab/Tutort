package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem6 {

	public static void main(String args[]) {

		int[] p={7,1,5,3,6,4};

		System.out.println(maxProfit(p));
	}

	private static int maxProfit(int[] prices) {
		int m = prices.length,returnVal=0;
		List<Integer> diff=new ArrayList<>();
		for (int i = 2; i < m; i++) {

			diff.add(prices[i] - prices[1]);
		}

		;

		if(Collections.max(diff)>0){
			returnVal=Collections.max(diff);
		}

		return returnVal;
	}
}
