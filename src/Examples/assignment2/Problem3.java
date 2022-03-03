package assignment2;

import java.util.HashSet;
import java.util.Set;

public class Problem3 {

	public static void main(String[] args){
		numJewelsInStones("aAb","aAAbbbb");
	}

	public static int numJewelsInStones(String jewels, String stones) {
		int jw=jewels.length();
		int s=stones.length();
		boolean jIsChar=true,sIsChar=true,unique=true;
		char[] jChar=new char[jw];
		char[] sChar=new char[s];
		//check all contraints and extract jewels and stones characters
		if(jw<=50 && jw>=1  && s>=1 &&  s<=50){
			for(int i=0;i<jw;i++){
				jChar[i]=jewels.charAt(i);
				if(!Character.isAlphabetic(jChar[i])){
					jIsChar=false;
					break;
				}
				Set<Character> hSet=new HashSet<>();
				unique=hSet.add(jChar[i]);
				if(!unique){
					break;
				}
			}
			for(int j=0;j<s;j++){
				sChar[j]=stones.charAt(j);
				if(!Character.isAlphabetic(sChar[j])){
					sIsChar=false;
					break;
				}
			}
		}
		//compare stones characters with jewels characters
		int totalCount=0;
		if(jIsChar && sIsChar){
			for(int i=0;i<jw;i++){
				for(int j=0;j<s;j++){
					if(jChar[i]==sChar[j]){
						totalCount++;
					}
				}
			}
		}
		return totalCount;

	}
}
