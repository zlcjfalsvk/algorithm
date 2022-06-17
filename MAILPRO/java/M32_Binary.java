package MAILPRO;

/**
양수 K가 주어지면 K 길이의 이진법 숫자를 모두 프린트하시오. 단, 연속으로 1이 있으면 안됩니다.
Given an integer K, print all binary strings of length K without consecutive 1s.
input:5
output: 00000 00001 00010 00100 00101 01000 01001 01010 10000 10001 10010 10100 10101
 */
public class M32_Binary {

    public static void main(String[] args) {
        solution(5, "", 0);        
    }

    public static void solution(int k, String now, int digit) {
        if(k == 0) {
            System.out.println(now);
            return;
        }
        solution(k -1, now + "0", 0);

        if(digit == 0) {
            solution(k -1, now + "1", 1);
        }
    }
}