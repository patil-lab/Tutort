package assignment1;

import java.util.Scanner;

public class Problem9 {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		int sum=n*(n+1)/2;
		System.out.println(sum);
	}
}
