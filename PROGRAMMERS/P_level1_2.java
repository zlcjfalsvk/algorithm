package PROGRAMMERS;

/**
 * 약수의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class P_level1_2 {

    class Solution {
        public int solution(int n) {
            if(n <= 1) return n;
            int answer = 1 + n;
            for(int i = 2 ; i <= n/2 ; i ++) {
                if(n % i == 0) answer+=i;
            }
            return answer;
        }
      }
}