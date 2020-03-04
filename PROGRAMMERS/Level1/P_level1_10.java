
package PROGRAMMERS.Level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 같은 숫자는 싫어 https://PROGRAMMERS.Level1.co.kr/learn/courses/30/lessons/12906
 */
public class P_level1_10 {

    public static void main(String[] args) {
        // System.out.println(solution(new int[]{1,1,3,3,0,1,1}));
        System.out.println(solution(new int[]{4,4,4,3,3}));
    }

	public static int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {
                answer.add(arr[i]);
            } else {
                if(arr[i] != answer.get(answer.size() - 1)) {
                    answer.add(arr[i]);
                }
            }
        }
        return answer.stream().mapToInt(r->r).toArray();
	}
    
}