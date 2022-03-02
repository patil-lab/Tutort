package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem7 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> arrayList ;
		List<Integer> newList;
		arrayList = IntStream.of(arr).boxed().collect(Collectors.toList());
		for(int i=0;i<=arrayList.size();i++) {
			if(i%2==0) {
				newList = removeMax(arrayList);
			}else {
				newList = removeMin(arrayList);
			}
			if(newList.size()==1){
				System.out.println(Arrays.toString(newList.toArray()));
			}
		}


	}

	private static List<Integer> removeMax(List<Integer> arr) {
		int max, maxIndex=0;
		for (int i = 0; i < arr.size(); i++) {
				max = arr.get(0);
				if (arr.get(i) > max) {
					maxIndex = i;
				}
		}
		 arr.remove(maxIndex);
		return arr;
	}

	private static List<Integer> removeMin(List<Integer> arr){
		int min, minIndex=0;
		for (int i = 0; i < arr.size(); i++) {

				min = arr.get(0);
				if (arr.get(i) < min) {
					minIndex = i;
			}
		}
		arr.remove(minIndex);
		return arr;
	}
}
