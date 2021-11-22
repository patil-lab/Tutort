package assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Problem9 {

	public static void main(String args[]){

		int[] arr = {3, 2, 3};
		majorityElement2(arr);
	}

	private static List<Integer> majorityElement2(int[] nums) {
		int m=nums.length;

		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:nums){
			if(map.containsKey(i)){
				map.put(i,(map.get(i)+1));
			}else{
				map.put(i,1);

			}
		}
		List<Integer> list=new ArrayList<>();
		Iterator<Map.Entry<Integer,Integer>> it=map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry<Integer,Integer> entry=it.next();
			if(entry.getValue()>(m/3)){
				list.add(entry.getKey());
			}



		}
		return list;
	}
}
