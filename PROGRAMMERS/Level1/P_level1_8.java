package PROGRAMMERS.Level1;

/**
 * 두 정수 사이의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */
public class P_level1_8 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int swap = 0;
            swap = a;
            a = b;
            b = swap;
        }
        for (int i = a; i <= b; i++) {
            answer += i;            
        }
        return answer;
    }    
}