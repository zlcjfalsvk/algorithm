package MAILPRO;

import java.util.HashMap;
import java.util.Map;

/**
String이 주어지면, 중복된 char가 없는 가장 긴 서브스트링 (substring)의 길이를 찾으시오. 
Given a string, find the longest substring that does not have duplicate characters.

예제)
Input: “aabcbcbc”
Output: 3 // “abc”

Input: “aaaaaaaa”
Output: 1 // “a”

Input: “abbbcedd”
﻿Output: 4 // “bced”
 */
public class M9_LongestString {

    public static void main(String[] args) {
        System.out.println(solution("aabcbcbc")); // 3
        System.out.println(solution("aaaaaaaa")); // 1
        System.out.println(solution("abbbcedd")); // 4
        System.out.println(solution("aabcvbcbc")); // 4
    }

    public static int solution(String str) {
        int max = 0;
        int now = 0;
        String[] arr = str.split("");
        Map<String, Integer> hash = new HashMap<>();
        for (String string : arr) {
            if(hash.containsKey(string)) {
                max = Math.max(max, now);
                now = 1;
            } else {
                hash.put(string, hash.getOrDefault(string, 0) + 1);
                now++;
            }
        }
        return max;
    }
}