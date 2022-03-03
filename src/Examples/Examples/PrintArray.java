package Examples;

public class PrintArray {


	public static void main(String[] args){
		int[] iArr=new int[]{1,2,3,4,5,6,7,8};
		printArray(iArr);
	}

	private static void printArray(int[] iArr) {

		int l=iArr.length;
		for(int i = 0; i<l; i++){
			System.out.println(iArr[i]);
		}
	}

}
