package assignment1;

import java.util.Scanner;

public class Problem3 {
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the array : ");
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the number :");
		int x=sc.nextInt();
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]<=x){
				count++;

			}

		}
		System.out.print(count);

	}
}
