package PROGRAMMERS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * P_level1_ì²´ìœ¡ë³µ
 * https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
 */
public class P_level1_6 {

    public static void main(String[] args) {
        P_level1_6 start = new P_level1_6();
        System.out.println(start.solution(5, new int[]{2,4}, new int[]{1,3,5}));// 4
        System.out.println(start.solution(5, new int[]{2,4}, new int[]{3})); //4 
        System.out.println(start.solution(3, new int[]{3}, new int[]{1})); //2
        System.out.println(start.solution(6, new int[]{1,2,4,5}, new int[]{1,4})); //4
        System.out.println(start.solution(24, new int[]{12, 13, 16, 17, 19, 20, 21, 22}, 
                                       new int[]{1, 22, 16, 18, 9, 10}));// 19
        System.out.println(start.solution(5, new int[]{1,3}, new int[]{2,4})); //5
        System.out.println(start.solution(5, new int[]{3,5}, new int[]{2,4})); //5
        System.out.println(start.solution(7, new int[]{2,3,4}, new int[]{1,2,3,6})); //6

    }


    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int saveReserve = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        List<Integer> a_lost  = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> a_reserve  = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        for(int i = 1; i <= n; i++){
            hash.put(i, 1);
        }

        for(int a : lost) {
            for(int b: reserve) {
                if (a == b) {
                    a_lost.removeIf(r -> r == a);
                    a_reserve.removeIf(r -> r == a);
                }
            }
        }
         
        for(int i=0; i < a_lost.size(); i++){
     hash.put(a_lost.get(i), hash.get(a_lost.get(i)) - 1);
        }

        for(int i=0; i < a_reserve.size(); i++){
            if(hash.get(a_reserve.get(i)) == 0) {
                hash.put(a_reserve.get(i), hash.get(a_reserve.get(i)) + 1);
                continue;
            } else if (hash.get(a_reserve.get(i) + 1) == null) {
                if (hash.get(a_reserve.get(i) - 1) == 0) {
                    hash.put(a_reserve.get(i) - 1, hash.get(a_reserve.get(i) - 1) + 1);
                }
            } else if (hash.get(a_reserve.get(i) - 1) == null) {
                if (hash.get(a_reserve.get(i) + 1) == 0) {
                    hash.put(a_reserve.get(i) + 1, hash.get(a_reserve.get(i) + 1) + 1);
                }
            } else {
                if(hash.get(a_reserve.get(i) + 1) == 0 && hash.get(a_reserve.get(i) - 1) == 0) {
                    saveReserve += 1;
                } else if (hash.get(a_reserve.get(i) + 1) == 0) {
                    hash.put(a_reserve.get(i) + 1, hash.get(a_reserve.get(i) + 1) + 1);
                } else if(hash.get(a_reserve.get(i) - 1) == 0) {
                    hash.put(a_reserve.get(i) - 1, hash.get(a_reserve.get(i) - 1) + 1);
                }
            }
        }

        for(Map.Entry<Integer, Integer> item : hash.entrySet()) {
            if(item.getValue() != 0) {
                answer += 1;
            }
        }
        return answer + saveReserve;
    }       



}