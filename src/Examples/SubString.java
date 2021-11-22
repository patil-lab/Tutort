package Examples;

public class SubString {

	public static void main(String args[]){
		String s="puttu";
		for (int i=0;i<s.length();i++) {
			s=s.substring(1,s.length()-i)+s.substring(0,1)+s.substring(s.length()-i,s.length());
		}

	}
}
