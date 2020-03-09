package MAILPRO;

import java.util.Arrays;

/**
    정수 배열(int array)이 주어지면 두번째로 큰 값을 프린트하시오.
    Given an integer array, find the second largest element.

    예제)
    Input: [10, 5, 4, 3, -1]
    Output: 5

    Input: [3, 3, 3]
    Output: Does not exist.
 */
public class M7_Second {

    public static void main(String[] args) {
        System.out.println(Solution(new int[]{10, 5, 4, 3, -1}));
        System.out.println(Solution(new int[]{3, 3, 3}));
    }

    // 정렬을 이용한 방법
    // public static String Solution(int[] arr) {
    //     Arrays.sort(arr);
    //     String answer;
    //     if(arr.length < 2) {answer = "Does not exist."; }
    //     if(arr[arr.length - 1] == arr[arr.length - 2]) {answer = "Does not exist."; }
    //     else {answer = arr[arr.length - 2] + "";}

    //     return answer;
    // }

    public static String Solution(int[] arr) {
        String answer = "";
        if(arr.length < 2) {answer = "Does not exist."; }
        int first, second;
        first = second = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i > first) {
                second = first;
                first = i;   
            } else if(i > second) {
                second = i;
            }            
        }

        if(first == second) {
            answer = "Does not exist.";
        } else {
            answer = second +"";
        }

        return answer;
    }    
}