package assignment1;

import java.util.Scanner;

public class BonusProblem {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int halflength=arr.length/2;
		int sumFirst=0;
		for(int i=0;i<halflength;i++){
			sumFirst+=arr[i];
		}
		int sumSec=0;
		for(int i=halflength;i<arr.length;i++){
			sumSec+=arr[i];
		}

		System.out.println("To make the array balanced you can add : "+ Math.abs(sumFirst-sumSec));

	}
}
