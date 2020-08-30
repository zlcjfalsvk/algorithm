package MAILPRO;

import java.util.HashMap;
import java.util.Map;

/**
 정렬되지 않은 정수 배열과 정수 S가 주어졌을 때, 합이 S가 되는 정수 배열 내의 두 수를 찾으시오.

Input: 정수 배열 = [8, 7, 2, 5, 3, 1], S = 10
Output: 인덱스 0 과 2 (8 + 2) 또는 인덱스 1 과 4 (7 + 3)
 */
public class M42_Sum {

    public static void main(String[] args) {
        solution(new int[]{8, 7, 2, 5, 3, 1}, 10);
    }

    public static void solution(int[] arr, int S) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(S - arr[i])) {
                System.out.println((S - arr[i]) + ", " + arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }        
    }
}