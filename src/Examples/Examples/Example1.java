package Examples;

public class Example1 {

	public static  void main(String args[]){

		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		int waterTrapped = waterTrapped(height);
		System.out.println("water trapped : "+ waterTrapped);
	}


	public static int waterTrapped(int[] height){

		int m=height.length;
		int lo=0,hi=m-1,leftMax=0,rightMax=0,result=0;
		while (lo<hi){
			if(height[lo]<height[hi]){
				if(height[lo]>leftMax){
					leftMax=height[lo];
				}else {
					result+=leftMax-height[lo];
					lo++;
				}
			}else {
				if(height[hi]>rightMax){
					rightMax=height[hi];

				}else {
					result+=rightMax-height[hi];
					hi--;
				}
			}
		}
		return result;
	}
}
