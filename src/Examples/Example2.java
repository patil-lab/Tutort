package Examples;

public class Example2 {


	public static void main(String[] args){
		int[] height={7,1,2,9,11};
		int i = largestArea(height);
		System.out.println(i);
	}

	public static int largestArea(int [  ] height){
		int n=height.length;
		int area=0,maxArea=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				area=Math.min(height[i],height[j])*(j-i);
				maxArea=Math.max(area,maxArea);
			}
		}
		return maxArea;
	}
}
