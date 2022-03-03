package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		int[] reverserArr = reverserArr(arr, 0, arr.length-1);
		if(Arrays.equals(reverserArr,arr)) {
			System.out.println("PERFECT");
		}else {
			System.out.println("NOT PERFECT");
		}

	}

	private static int[] reverserArr(int[] arr, int start, int end) {
		int temp;
		while (start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
}
