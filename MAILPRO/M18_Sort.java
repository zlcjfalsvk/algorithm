package MAILPRO;

import java.util.Arrays;

/**
 * O(n log n)시간 복잡도를 가진 정수 배열 정렬 알고리즘을 구현하시오.
Implement an O(n log n) time complexity sorting algorithm.

예제)
Input: [3, 1, 5, 6]
Output: [1, 3, 5, 6]
 */
public class M18_Sort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 1, 5, 6})));
    }

    public static int[] solution(int[] arr) {
        quickSort(0, arr.length - 1, arr);
        return arr;
    }

    public static void quickSort(int start, int end, int[] arr) {
        if(start < end) {
            int pivot = partition(start, end, arr);
            quickSort(start, pivot, arr);
            quickSort(pivot + 1, end, arr);
        }
    }

    public static int partition(int start, int end, int[] arr) {
        int pivot = (start + end) / 2;
        while(start < end) {
            while(arr[start] < arr[pivot] && (start < end)) start++;
            while(arr[end] > arr[pivot]  && (start < end)) end--;
            if(start < end) {swap(arr, start, end);}
        }
        return start;
    }

    public static void swap(int[]arr, int a, int b) {
        int swap = 0;
        swap = arr[b];
        arr[b] = arr[a];  
        arr[a] = swap;      
    }
}