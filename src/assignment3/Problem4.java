package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem4 {
	public static void main (String[] args) {
		int n = 3;
		List<List<Integer>> lis=printPascal2(n);
		System.out.println("ji");



	}

	private static int[][] printPascal(int n) {
		int[][] array = new int[n][n];
		List<List<Integer>> listOfList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			List<Integer> innerArray = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					array[i][j] = 1;
				} else {
					array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
				}

			}

		}
		return array;
	}

	private static List<List<Integer>> printPascal2(int n){
		List<List<Integer>> mainArray=new ArrayList<>();
		List<Integer> innerArray1=new ArrayList<>();
		innerArray1.add(1);
		mainArray.add(innerArray1);
		for(int i=1;i<n+1;i++){
			List<Integer> tempRow=new ArrayList<>();
			for(int j=0;j<=i;j++){
				if(j==0 || j==i){
					tempRow.add(1);
				}else {
					List<Integer> prevRow=mainArray.get(i-1);
					int temp=prevRow.get(j-1)+prevRow.get(j);
					tempRow.add(temp);
				}
			}
			mainArray.add(tempRow);
		}
		return mainArray;
	}


}
