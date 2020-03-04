package PROGRAMMERS.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 나누어 떨어지는 숫자 배열
 * https://PROGRAMMERS.Level1.co.kr/learn/courses/30/lessons/12910
 */
public class P_level1_12 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,9,7,10}, 5)));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (Integer integer : arr) {
            if(integer % divisor == 0) {
                answer.add(integer);
            }
        }
        
        return answer.size() ==0 ? new int[]{-1} : answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
    
}