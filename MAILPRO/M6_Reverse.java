package MAILPRO;

/**
 주어진 string 에 모든 단어를 거꾸로 하시오.
Reverse all the words in the given string.

예제)
Input: "abc 123 apple"
Output: "cba 321 elppa"
 */
public class M6_Reverse {

    public static void main(String[] args) {
        System.out.println(solution("abc 123 apple"));
    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        String[] arr = str.split(" ");
        for (String string : arr) {
            answer.append(reverse(string));
            answer.append(" ");
        }
        return answer.toString().trim();
    }

    public static String reverse(String str) {
        StringBuilder a = new StringBuilder();
        String[] s = str.split("");
        for(int i = s.length - 1; i >= 0 ; i--) {
            a.append(s[i]);
        }
        // a.append(str).reverse().toString()
        return a.toString();
    }

    
}