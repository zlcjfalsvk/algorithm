package PROGRAMMERS.Level1;

import PROGRAMMERS.Level1.P_level1_2.Solution;

/**
 * 시저암호
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */
public class P_level1_13 {

    public static void main(String[] args) {

        System.out.println(solution("AB", 1)); // BC
        System.out.println(solution("YZ", 1)); // ZA
        System.out.println(solution("z", 1)); // a
        System.out.println(solution("a B z", 4)); // e F d
    }

    public static String solution(String s, int n) {
        StringBuilder stb = new StringBuilder();
        String[] arr = s.split("");
        for (String string : arr) {
            int a = (int) string.charAt(0);
            int v = a + n;
            if(a == 32) {
                stb.append(string);
            } else if(a >= 97) {
                int r = v > 122 ? (97 + (v % 97)) - 26 : (97 + (v % 97));
                stb.append((char)r);
            } else {
                int r = v > 90 ? (65 + (v % 65)) - 26: (65 + (v % 65));
                stb.append((char)r);
            }
            
        }
        return stb.toString();
    }
}