package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

	public static void main(String[] args){

		int[] nums={2,10,36,99};
		List<String> list=findMissing(nums,4);
		System.out.println("k");
	}

	private static List<String> findMissing(int[] nums, int n){

		List<String> list=new ArrayList<>();
		int m=nums.length;
		int lower=0;
		int upper=nums[m-1]-1;
		for(int i=0;i<m;i++){
			if(nums[i]>lower) {
				if (nums[i] - lower == 1) {
					list.add(lower + "");
				} else {
					list.add(lower + "-->" + (nums[i] - 1));
				}
			}else{

			}
			lower=nums[i] +1;
		}
		if(lower<upper){
			list.add(lower+"-->"+upper);
		}else if(lower==upper){
			list.add(lower+"");
		}


		return list;
	}
}
