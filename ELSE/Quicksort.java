package ELSE;

import java.util.Arrays;

/**
 * B_2751
 */
public class Quicksort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
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
        while(left < right) {     
            while(arr[left] < arr[pivot] && (left < right)) { left++; }
            while(arr[right] > arr[pivot] && (left < right)) { right--; }
            if(left < right) {swap(arr, left, right);}
        } 
        return left;
    }



    public static void swap(int[]arr, int a, int b) {
        int swap = 0;
        swap = arr[b];
        arr[b] = arr[a];  
        arr[a] = swap;      
    }
}
