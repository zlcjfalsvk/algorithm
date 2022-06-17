package MAILPRO;

import java.util.Arrays;

/**
    정수 배열과 정수 k가 주어지면 모든 원소를 k칸씩 앞으로 옮기시오.
    Given an array and an integer K, shift all elements in the array K times.

    input: [1, 2, 3, 4, 5], k = 2
    output: [3, 4, 5, 1, 2]

    input: [0, 1, 2, 3, 4], k = 1
    output: [1, 2, 3, 4, 0]

    시간복잡도와 공간복잡도를 최대한 최적화 하시오.
 */
public class M20_ShiftArray {
    
    public static void main(String[] args) {
        /**
         * 뒤집기를 이용하면 쉬움
         * 
         * 1. 2,1   3,4,5
         * 2. 2,1   5,4,3
         * 3. 3,4,5 1,2
         */
        shift(new int[]{1,2,3,4,5}, 2);
        // shift(new int[]{0,1,2,3,4}, 1);
    }

    public static void shift(int[] arr, int k) {

        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[]arr, int start, int end) {
        while(end > start) {
            int swap = arr[start];
            arr[start] = arr[end];
            arr[end] = swap;
            start++;
            end--;
        }
    }
}