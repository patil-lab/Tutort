package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {

	public static void main(String[] args){


			int n = 3;
			List<Integer> lis=printPascal2(n);
			System.out.println("ji");
	}

	private static List<Integer> printPascal2(int n){
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
		return mainArray.get(mainArray.size()-1);
	}
}
