package MAILPRO;

import java.util.Arrays;

/**
0, 1, 2로 이루어진 배열을 가장 효율적으로 정렬 하시오. 시간복잡도 O(n).
Given an array consisting of 0, 1 and 2s, sort this array.

Input: [0, 1, 2, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 1, 1, 2, 2]
 */
public class M34_sort {

    public static void main(String[] args) {
        
        int[] arr = new int[]{0, 1, 2, 2, 0, 0, 0, 1};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void solution(int[] arr) {

        int i = 0, left = 0, right = arr.length - 1;

        while(i <= right) {
            if(arr[i] == 0 ){
                swap(arr, i, left);
                left ++;
                i ++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, right);
                right--;
            }
        }
    }

    public static void swap(int[]arr, int a, int b) {
        int swap = 0;
        swap = arr[b];
        arr[b] = arr[a];  
        arr[a] = swap;      
    }
}