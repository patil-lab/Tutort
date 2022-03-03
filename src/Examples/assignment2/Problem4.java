package assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {
	public static void main(String args[]) {

		int[] arr ={3,8,-10,23,19,-4,-14,27};

		List<List<Integer>> lists = minimumAbsoluteDifference(arr);

	}

	private static List<List<Integer>> minimumAbsoluteDifference(int [] arr){
		List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
		int minDiff=0,diff;
		int size=sortedList.size();
		List<Integer> miniArr=new ArrayList<>();
		//find min difference
		for(int i=0;i<size-1;i++){
			diff=Math.abs(sortedList.get(i) - sortedList.get(i+1));

			miniArr.add(diff);

		}
		minDiff= Collections.min(miniArr);
		List<List<Integer>> lisOfList=new ArrayList<>();

		for(int i=0;i<size-1;i++){
			if((Math.abs(sortedList.get(i) - sortedList.get(i+1)))==minDiff){
					List<Integer> innerList=new ArrayList<>();
					innerList.add(sortedList.get(i));
					innerList.add(sortedList.get(i+1));
				lisOfList.add(innerList);
			}

		}



		return lisOfList;

	}

}


