package PROGRAMMERS.Level2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 기능 개발 https://programmers.co.kr/learn/courses/30/lessons/42586
 */
public class P_level2_3 {

    public static void main(String[] args) {
        // solution(new int[]{93, 30 ,55}, new int[]{1, 30, 5}); // 2, 1
        // solution(new int[]{98, 0 ,55}, new int[]{1, 100, 5}); // 2, 1
        // solution(new int[]{40, 93, 30, 55, 60, 65}, new int[]{60, 1, 30, 5 , 10, 7}); // 1, 2, 3
        // solution(new int[]{93, 30, 55, 60, 40, 65}, new int[]{1, 30, 5 , 10, 60, 7}); // 2, 4  
        // HashMap을 쓰다 순서 보장이 안되어 LinkedHashMap 이용
        solution(new int[]{0, 0, 0, 0 , 0}, new int[]{20, 35, 3, 4, 50}); // 5 , 3, 34, 25, 2  => 2, 3   
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> hash = new LinkedHashMap<>();
        int stack = 0;
        for(int i = 0; i < progresses.length; i++){
            int n = 100 - progresses[i]; // 남은 작업량
            int day = (int) Math.ceil(n / (double) speeds[i]);// 남은 작업
            stack = Math.max(day, stack);
            if(day <= stack) {
                hash.put(stack, hash.getOrDefault(stack, 0) + 1);
            } else {
                hash.put(day, hash.getOrDefault(day, 0) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> item : hash.entrySet()) {
            answer.add(item.getValue());
        }
        int[] ret = answer.stream().mapToInt(Integer::intValue).toArray();
        return ret;
    }
}