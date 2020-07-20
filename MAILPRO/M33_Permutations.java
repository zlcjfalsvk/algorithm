package MAILPRO;

import java.util.Objects;

/**
 * 
문자배열이 주어지면, 주어진 문자로 만들수 있는 모든 문자배열 조합을 프린트 하시오.
Given a string, print all permutations of characters in the string.

input: ABC
output: ABC ACB BAC BCA CBA CAB
 */
public class M33_Permutations {

    public static void main(String[] args) {
        // solution("ABCD");
        // System.out.println("");
        solve("ABCD", 0, "ABCD".length() -1);
    }

    public static void solution(String str) {
        String[] arr = str.split("");
        for(int i = 0; i < arr.length; i ++) {
            boolean[] visit = new boolean[arr.length];
            visit[i] = true;
            completlySearch(arr, visit, arr[i], 1);
        }
    }

    public static void completlySearch(String[] arr, boolean[] visit, String result, int visitCount) {
        if(visitCount == arr.length) {System.out.println(result); return;}
        for(int i = 0; i < arr.length; i ++) {
            if(visit[i] == false) {
                boolean[] newVisit = visit.clone();
                newVisit[i] = true;
                completlySearch(arr, newVisit, result + arr[i], visitCount + 1);
            }
        }
    }


    // -----------------------------------------------------

    public static void solve(String str, int l, int r) {
        if(l==r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                solve(str, l + 1, r);
                str = swap(str, l, i);
              }
        }
    }

    public static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
      }
}