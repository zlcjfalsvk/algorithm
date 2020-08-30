package MAILPRO;

import java.util.HashSet;
import java.util.Set;

/**
정수 배열이 주어졌을 때, 부분 배열(sub-array)의 합이 0이 될 수 있는지 확인하시오.
부분 배열은 배열 내의 연속된 원소들의 집합입니다.


Input: [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]

Output: 부분 배열 존재
[3, 4, -7]
[4, -7, 3]
[-7, 3, 1, 3]
[3, 1, -4]
[3, 1, 3, 1, -4, -2, -2]
[3, 4, -7, 3, 1, 3, 1, -4, -2, -2]
 */
public class M43_SumZero {
    public static void main(String[] args) { 

        if(solution(new int[] {3, 4, -7, 3, 1, 3, 1, -4, -2, -2})) {
            System.out.println("쌉가능");
        } else {
            System.out.println("쌉 불가능");
        }
    }

    public static boolean solution(int[] arr) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int item : arr) {
            sum += item;
            if(set.contains(sum)) {return true;}
            set.add(item);
        }
        return false;
    }
}