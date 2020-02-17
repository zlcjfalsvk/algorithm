package MAILPRO;

/**
 * 안녕하세요, 매일프로그래밍 이번주 문제입니다.
    
    피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
    Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers. Given an integer N, find the sum of all even fibonacci numbers.

    예제)
    Input: N = 12
    Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(solution(35));
    }    

    public static int solution(int num) {
        return solution(0, 1, 0, num);
    }

    public static int solution(int n, int m, int sum, int num) {
        if((n+m) > num) return sum;
        int fibo = n + m;
        if(fibo % 2 == 0) sum+= fibo;
        return solution(m, fibo, sum , num);
    }
}