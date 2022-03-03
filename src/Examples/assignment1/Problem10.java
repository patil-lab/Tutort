package assignment1;

import java.util.Scanner;

public class Problem10 {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int multplyBy2=n*2;
		int multplyBy3=n*3;
		String concat = Integer.toString(n).concat(Integer.toString(multplyBy2)).concat(Integer.toString(multplyBy3));
		int integer = Integer.valueOf(concat);
		int sum=0;
		int[] intArr=new int[10];
		while (integer>0){
			for(int i=0;i<concat.length();i++){
				intArr[i]=integer%10;
				integer=integer/10;
				sum+=intArr[i];
			}
		}


		int sumOfNNumbers=9*10/2;
		if(sum==sumOfNNumbers){
			System.out.println("PERFECT");
		}else {
			System.out.println("NOT PERFECT");
		}
	}
}
