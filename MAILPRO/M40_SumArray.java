
package MAILPRO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
정수 배열과 정수 S가 주어졌을 때, 원소의 합이 S와 같은 가장 긴 부분 배열을 구하시오.
부분 배열은 배열 내의 연속된 원소들의 집합입니다.

 Input: [5, 6, -5, 5, 3, 5, 3, -2, 0], S = 8
Output: [-5, 5, 3, 5]
 */
public class M40_SumArray {

    public static void main(String[] args) {
        Integer[] sol = solution(new int[]{5, 6, -5, 5, 3, 5, 3, -2, 0}, 8);
        System.out.println(Arrays.toString(sol));        
    }

    public static Integer[] solution(final int[] arr, int sum) {
        int maxLength = 0;        
        Integer[] maxArr = new Integer[0];
        
        for(int i = 0; i < arr.length; i++) {
            int length = 0;
            int value = 0;
            List<Integer> list = new ArrayList<>(); 
            // 현재 위치의 배열 길이 찾기
            for(int j = i; j < arr.length; j++) {
                if(value == sum) {
                    if(length > maxLength) {
                        maxLength = length;
                        // 배열에 리턴
                        maxArr = list.toArray(Integer[]::new);
                    }
                    break;
                } else {
                    value += arr[j];
                    length++;
                    // 배열에 넣기                    
                    list.add(arr[j]);

                }
            }
        } 
        return maxArr;
    }
    
}