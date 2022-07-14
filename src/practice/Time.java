package practice;

public class Time {

	public static void main(String[] args) {

		System.out.println(solution(1172));
	}

	public static String solution(int n) {
		int week = n / (7 * 24 * 3600);
		n = n % (7 * 24 * 3600);
		int day = n / (24 * 3600);

		n = n % (24 * 3600);
		int hour = n / 3600;

		n %= 3600;
		int minutes = n / 60;

		n %= 60;
		int seconds = n;

		String s = (minutes == 0) ? "" : +minutes + "" + "m";
		String si = ((minutes == 0) ? "" : (seconds < 10) ? "" + (minutes + 1) + "" : +minutes + "" + "m");

		String ret = ((week == 0) ? "" : +week + "" + "w") + ((day == 0) ? "" : +day + "" + "d") +
				((hour == 0) ? "" : +hour + "" + "h") + ((minutes == 0) ? "" : (seconds < 10) ? "" + (minutes + 1) + "m" : +minutes + "" + "m") +
				((seconds < 10 && minutes != 0) ? "" : +seconds + "" + "s");

		return ret;
	}


}
