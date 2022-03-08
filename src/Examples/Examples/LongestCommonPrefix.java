package Examples;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = {"flower", "flow", "flight"};
		String st = logestCommonPrefix(str);
		System.out.println(st);
	}

	private static String logestCommonPrefix(String[] strs) {

		if (strs.length == 0) return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0)
				prefix = prefix.substring(0, prefix.length() - 1);
		}
		return prefix;
	}
}
