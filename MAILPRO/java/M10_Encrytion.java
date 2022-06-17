package MAILPRO;

import java.util.HashMap;
import java.util.Map;

/**
길이가 같은 두 문자열(string) A 와 B가 주어지면, A 가 B 로 1:1 암호화 가능한지 찾으시오.
Given two strings of equal length, check if two strings can be encrypted 1 to 1.

예제)
Input: “EGG”, “FOO”
Output: True // E->F, G->O

Input: “ABBCD”, “APPLE”
Output: True // A->A, B->P, C->L, D->E

Input: “AAB”, “FOO”
Output: False
 */
public class M10_Encrytion {

    public static void main(String[] args) {
        System.out.println(solution("EGG", "FOO")); 
        System.out.println(solution("ABBCD", "APPLE"));
        System.out.println(solution("AAB", "FOO")); 
    }

    public static boolean solution(String str1, String str2) {
        boolean ret = true;
        Map<String, String> hash = new HashMap<>();
        String[] str1A = str1.split("");
        String[] str2A = str2.split("");

        for (int i = 0; i < str1.length(); i++) {
            if(hash.get(str1A[i]) != null && !hash.get(str1A[i]).equals(str2A[i])) {
                ret = false;
                break;
            }
            hash.put(str1A[i], str2A[i]);
        }
        return ret;
    }
}