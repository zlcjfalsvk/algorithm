package PROGRAMMERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * P_level2 ?
 * https://programmers.co.kr/learn/courses/30/lessons/42588
 */
public class P_level2_1 {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new Integer[]{6,9,5,7,4})));
        System.out.println(Arrays.toString(solution(new Integer[]{3,9,9,3,5,7,2})));
        System.out.println(Arrays.toString(solution(new Integer[]{1,5,3,6,7,6,5})));
    }

    public static int[] solution(Integer[] integers) {
        List<Integer> answer = new ArrayList<>();
        int layer = 0, now = 0, max = 0;
        for (int i = 0; i < integers.length; i++) {
            if(i == 0) {answer.add(layer);}
            else {
                if(now > integers[i]) {
                    layer = i;
                    answer.add(layer);
                } else {
                    if(integers[layer] < integers[i] && max < integers[i]) {
                        answer.add(0);
                    } else {
                        answer.add(layer);
                    }

                }
            }
            max = Math.max(max, integers[i]);
            now = integers[i];
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}