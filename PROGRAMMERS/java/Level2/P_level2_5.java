package PROGRAMMERS.Level2;

import java.util.Arrays;

/**
 * 가장 큰 수
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 */
public class P_level2_5 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{6, 10, 2})); // 6210
        System.out.println(solution(new int[]{3, 30, 34, 5, 9})); // 9534330

    }

    public static String solution(int[] numbers) {
        String[] strarr = new String[numbers.length];
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            strarr[i] = numbers[i] + "";
        }
        Arrays.sort(strarr, (a, b) -> (b + a).compareTo(a + b));
        if(strarr[0].equals("0")) return "0";
        for (String string : strarr) {
            answer.append(string);
        }
        return answer.toString();
    }
}