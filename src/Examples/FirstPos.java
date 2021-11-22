package Examples;

public class FirstPos {

	public static void main(String args[]){
		int[] arr={1,2,3,4,4,4,5,6,7,7};
		int elemnet=4;
		int f=firstOccurence(arr,elemnet);
		int l=lastOccurence(arr,elemnet);
		int noOfOccurence=l-f+1;
		System.out.println("No of occurences: "+noOfOccurence);
	}

	public static int firstOccurence(int[] arr, int elemnet){
		int firstIndex = -1;
		int m=arr.length;
		int start=0,end=m;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == elemnet) {
				firstIndex = mid;
				end = mid - 1;
			} else if (elemnet < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return firstIndex;
	}
	public static int lastOccurence(int[] arr, int elemnet){
		int m=arr.length;
		int low=0,high=m,index=-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(elemnet==arr[mid]){
				index=mid;
				low=mid-1;
			}
			if(elemnet<arr[mid]){
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return index;
	}

}
