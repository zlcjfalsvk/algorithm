package MAILPRO;

/**
 정수 배열(int array)이 주어지면 0이 아닌 정수 순서를 유지하며 모든 0을 배열 오른쪽 끝으로 옮기시오. 단, 시간복잡도는 O(n), 공간복잡도는 O(1)여야 합니다.
Given an integer array, move all the 0s to the right of the array without changing the order of non-zero elements.

예제)
Input: [0, 5, 0, 3, -1]
Output: [5, 3, -1, 0, 0]

Input: [3, 0, 3]
Output: [3, 3, 0]
 */
public class M8_NONZERO {


    public static void main(String[] args) {
        solution(new int[]{0, 5, 0, 3, -1});
        solution(new int[]{3, 0, 3});
    }
    
    public static int[] solution(int[] arr) {
        int zi = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                swap(arr, i, zi);
                zi++;
            }
        }
        
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        // if(i == j) return;
        int s = 0;
        s = arr[i];
        arr[i] = arr[j];
        arr[j] = s;
    }
}