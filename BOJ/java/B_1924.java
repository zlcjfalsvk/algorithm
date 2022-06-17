package BOJ;

import java.util.Scanner;

public class B_1924 {
	
	static Scanner scan = new Scanner(System.in);
	final static int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	final static String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	public static void main(String[] args) {
		System.out.println(getDay(scan.nextInt(), scan.nextInt()));
		
	}
	
	@SuppressWarnings("unused")
	static String getDay(int month, int day) {
		
		int daySum = 0;
		
		for (int i = 0; i < month -1; i++) {
			daySum += monthDay[i];			
		}
		daySum += day;
		
				
		return week[daySum % 7];
	}

}
