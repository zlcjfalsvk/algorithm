package MAILPRO;

/**
정렬된 양수(positive integer) 배열이 주어지면, 배열 원소들의 합으로 만들수 없는 가장 작은 양수를 구하시오.
단, 시간복잡도는 O(n) 이여야 합니다.

Given an array of positive integers, find the smallest positive integer that cannot be created by adding elements in the array.

input: [1, 2, 3, 8]
output: 7

// 1 = 1
// 2 = 2
// 3 = 3
// 4 = 1 + 3
// 5 = 2 + 3
// 6 = 1 + 2 + 3
// 7 = 불가능
 */
public class M23_MinInteger {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 8}));
    }

    public static int solution(int[] arr) {
        int min = 1;
        for (int i : arr) {
            if(i <= min) {
                min += i;
            } else {
                break;
            }
        }
        return min;
    }   
}