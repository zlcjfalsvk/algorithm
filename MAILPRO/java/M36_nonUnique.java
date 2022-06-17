package MAILPRO;

import java.util.HashMap;
import java.util.Map;

/**
랜덤한 정수 배열이 주어지면 중복된 원소의 값을 모두 프린트 하시오. 단, 공간복잡도 O(1)이여야 합니다.
Given an integer array, print all non unique elements.

input: [0, 6, 3, 4, 0]
output: 0

input: [5, 4, 3, 2, 1, 1, 1, 1, 1, 2]
output: 1, 2
 */

public class M36_nonUnique {
    
    public static void main(String[] args) {
        // solution(new int[]{0, 6, 3, 4, 0});
        solution(new int[]{5, 4, 3, 2, 1, 1, 1, 1, 1, 2});        
    }

    public static void solution(int[] arr) {

        Map<Integer, Integer> hash = new HashMap<>();
        for (int i : arr) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }

        hash.entrySet().forEach(k -> {
            if(k.getValue() > 1) {
                System.out.println(k.getKey());
            }
        });
     }
}