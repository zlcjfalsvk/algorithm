package MAILPRO;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
정수 배열이 주어졌을 때, 중복된 값이 들어 있지 않고 연속된 정수로 구성된 가장 긴 부분 배열을 구하시오.
부분 배열은 배열 내의 연속된 원소들의 집합입니다.

Input: [2, 0, 2, 1, 4, 3, 1, 0]
Output: [0, 2, 1, 4, 3]
 */

public class M39_LongArray {

    public static void main(final String[] args) {
        Integer[] solution = solution(new int[] {2, 0, 2, 1, 4, 3, 1, 0});
        System.out.println(Arrays.toString(solution));
    }

    public static Integer[] solution(final int[] arr) {
        int maxLength = 0;        
        Integer[] maxArr = new Integer[0];


        for(int i = 0; i < arr.length; i++) {

            int length = 0;
            Set<Integer> set = new LinkedHashSet<>();

            // 현재 위치의 배열 길이 찾기
            for(int j = i; j < arr.length; j++) {
                if(set.contains(arr[j])) {
                    if(length > maxLength) {
                        maxLength = length;
                        maxArr = set.toArray(new Integer[0]);
                    }
                    break;
                } else {
                    set.add(arr[j]);
                    length++;
                }
            }
        } 
        return maxArr;
    }
    
}