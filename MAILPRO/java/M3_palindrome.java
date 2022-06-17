package MAILPRO;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를
 * 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다. Given an integer, check if it is a palindrome.
 * 
 * 예제) Input: 12345 Output: False
 * 
 * Input: -101 Output: False
 * 
 * Input: 11111 Output: True
 * 
 * Input: 12421 Output: True
 */
public class M3_palindrome {

    public static void main(String[] args) {
        
        System.out.println(solution(12345));
        System.out.println(solution(-101));
        System.out.println(solution(11111));
        System.out.println(solution(12421));
        System.out.println(solution(2442));
        System.out.println(solution(1029));
    }

    public static boolean solution(int n) {
        if(n < 0) { return false; }
        List<Integer> arr = getNum(n, new ArrayList<>());
        boolean result = true;
        for(int i = 0; i < arr.size() / 2 ; i ++) {
            if(i > arr.size() / 2 ) break;
            if(arr.get(i) != arr.get(arr.size() -1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }


    public static List<Integer> getNum(int n, List<Integer> array) {
        if(n == 0) return array;
        int an = n % 10;
        array.add(an);
        return getNum(n / 10, array);
    }
}