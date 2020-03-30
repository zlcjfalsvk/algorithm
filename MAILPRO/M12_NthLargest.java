package MAILPRO;

import java.util.Arrays;

/**
 정수 배열(int array)과 정수 N이 주어지면, N번째로 큰 배열 원소를 찾으시오.
Given an integer array and integer N, find the Nth largest element in the array.

예제)
Input: [-1, 3, -1, 5, 4], 2
Output: 4

Input: [2, 4, -2, -3, 8], 1
Output: 8

Input: [-5, -3, 1], 3
﻿Output: -5
 */
public class M12_NthLargest {

    public static void main(String[] args) {
        // System.out.println(solution(new int[]{-1, 3, -1, 5, 4}, 2));
        // System.out.println(solution(new int[]{2, 4, -2, -3, 8}, 1));
        // System.out.println(solution(new int[]{-5, -3, 1}, 3));       
    }

    // 이렇게 쉽게 하면 알고리즘 공부 무의미...
    // public static int solution(int[] arr, int findNum) {
    //     Arrays.sort(arr);
    //     return arr[arr.length - findNum];
    // }

    public static int solution(int[] arr, int findNum) {
        quickSort(arr, 0, arr.length - 1);
        return arr[arr.length - findNum];
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int pivot = partition(left, right, arr);
            quickSort(arr, left, pivot);
            quickSort(arr, pivot + 1, right);            
        }
    }

    public static int partition(int left, int right, int[] arr) {
        int pivot = (left + right) / 2;
        while(left < right && left != pivot && right != pivot) {
            while(arr[left] < arr[pivot] && (left < right)) left++;
            while(arr[right] > arr[pivot] && (left < right)) right--;
            if(left < right) swap(left, right, arr);
        }
        return left;
    }

    public static void swap(int left, int right, int[] arr) {
        int swap = 0;
        swap = arr[left];
        arr[left] = arr[right];
        arr[right] = swap;
    }    
}