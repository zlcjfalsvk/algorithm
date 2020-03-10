package PROGRAMMERS.Level2;

/**
 * 124나라의 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 */
public class P_level2_2 {
    public static void main(String[] args) {
        System.out.println(solution(new StringBuilder(), 4));        
    }

    public static String solution(StringBuilder answer, int n) {

        if(n == 0) {
            return answer.reverse().toString();
        }
        if(n%3 == 0) {
            answer.append(4);
        }else {
            answer.append(n%3);
        }
        return solution(answer, (n - 1) / 3);

    }    
}