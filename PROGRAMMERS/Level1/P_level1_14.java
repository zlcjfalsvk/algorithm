package PROGRAMMERS.Level1;

import java.util.Arrays;

/**
 * 문자열 내 마음대로 정렬하기
 * https://programmers.co.kr/learn/courses/30/lessons/12915ㄴ
 */
public class P_level1_14 {

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        // System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car", "asfds", "basdfe", "afeswav"}, 0)));
        
    }

    public static String[] solution(String[] strings, int n) {
        sort(strings, n ,0, strings.length - 1);
        return strings;
    }  

    private static void sort(String[] arrs, int n, int left, int right) {
        if(left < right) {
            int pivot = partition(arrs, n, left, right);
            sort(arrs, n, left, pivot);
            sort(arrs, n, pivot + 1, right);
        }
    }

    private static int partition(String[] arrs, int n, int left, int right) {
        int pivot = (left + right) / 2;
        while(left < right) {

            while(arrs[left].charAt(n) < arrs[pivot].charAt(n) && (left < right)) {
                left ++;
            }                        
            while( arrs[right].charAt(n) > arrs[pivot].charAt(n) && (left < right)) {
                right --;
            }
            if(arrs[left].charAt(n) == arrs[right].charAt(n) && arrs[left].compareTo(arrs[right]) > 0) {swap(arrs, left, right); left++;} 
            else if(arrs[left].charAt(n) == arrs[right].charAt(n) && arrs[left].compareTo(arrs[right]) < 0) { right--; }
            if (arrs[left].charAt(n) != arrs[right].charAt(n)) {swap(arrs, left, right);} 
        }
        return left;
    }

    public static void swap(String[]arr, int a, int b) {
        String swap = "";
        swap = arr[b];
        arr[b] = arr[a];  
        arr[a] = swap;      
    }

}