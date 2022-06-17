package MAILPRO;

/**
주어진 정수가 4의 거듭제곱인지 확인하시오.
Given an integer, check if it is a power of 4.
 */
public class M27_Power {

    public static void main(String[] args) {
        System.out.println(solution(16));
        System.out.println(solution(14));
    }

    public static boolean solution(int value) {
        
        if(value == 0) return false;
        while(value != 1) {
            if (value % 4 != 0) return false;
            value /= 4;
        }
        return true;
    }
}