package PROGRAMMERS.Level1;

import java.util.Calendar;

/**
 * P_level1_9
 */
public class P_level1_9 {
    final static String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

    public static String solution(int a, int b) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a - 1, b);
        return week[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
}