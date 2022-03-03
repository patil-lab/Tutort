package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem8 {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		List<Integer> arrayList= IntStream.of(arr).boxed().collect(Collectors.toList());
		List<Integer> newList=new ArrayList<>();
		int size=arrayList.size();
		for(int i=0;i<size;i++){


				newList=removeMax(arrayList);
			if(arrayList.size()==size-2){
				break;
			}
		}
		Collections.sort(newList);
		System.out.println(Arrays.toString(newList.toArray()));

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
}
