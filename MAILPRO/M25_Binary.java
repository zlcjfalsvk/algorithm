package MAILPRO;

/**
 * 
주어진 정수를 2진법으로 나타내었을때 1의 갯수를 리턴하시오.
Given an integer, count number of 1s in binary representation of an integer.

Brian Kernighan's algorithm

시간 복잡도: O(log n)

input: 6 // 110
output: 2

input: 13 // 1101
output: 3
 */
public class M25_Binary {

    public static void main(String[] args) {
        System.out.println(solution(6, 0));
        System.out.println(solution(13, 0));
    }
    
    public static int solution(int value, int cnt) {
        if(value == 0) return cnt;      
        return solution(value &= (value-1), cnt + 1);
    }
}