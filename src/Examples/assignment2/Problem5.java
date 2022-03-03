package assignment2;

public class Problem5 {
	public static void main(String[] args){
		int[ ] arr= {1,2,34,3,4,5,7,23,12};
		System.out.println(threeConsecutiveOdds(arr));
	}

	public static boolean threeConsecutiveOdds(int[] arr) {
		int n=arr.length;
		boolean returnBoolean=false;
		if(n<3){
			returnBoolean= false;
		}
		for (int i=2;i<n;i++){
			if(arr[i-2]%2==1 && arr[i-1]%2==1 && arr[i]%2==1){
				returnBoolean= true;
			}
		}
		return returnBoolean;
	}
}
