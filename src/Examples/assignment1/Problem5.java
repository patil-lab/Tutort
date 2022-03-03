package assignment1;

import java.util.Scanner;

public class Problem5 {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of integers : ");
		int n=sc.nextInt();
		System.out.println("Enter the index key: ");
		int key=sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		int[] arr=new int[20];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(i==key){
				System.out.println(arr[i]);
			}
		}

	}
}
