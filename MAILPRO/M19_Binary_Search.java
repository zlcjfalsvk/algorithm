package MAILPRO;

/**
    정렬(sort)된 정수 배열과 정수 n이 주어지면, 배열안에 n이 있는지 체크하시오. 시간복잡도를 최대한 최적화하시오.
    Given a sorted integer array and an integer N, check if N exists in the array.

    예제)
    Input: [1, 2, 3, 7, 10], 7
    Output: true

    Input: [-5, -3, 0, 1], 0
    Output: true

    Input: [1, 4, 5, 6, 8, 9], 10
    Output: false
 */
public class M19_Binary_Search {

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 7, 10}, 7));    
        System.out.println(search(new int[]{-5, -3, 0, 1}, 0));
        System.out.println(search(new int[]{1, 4, 5, 6, 8, 9}, 10));
    }

    public static boolean search(int[] arr, int find) {

        int start = 0;
        int end = arr.length - 1;

        while(end >= start) {
            int middle = (end + start) / 2;
            if(arr[middle] == find) return true;
            if(arr[middle] > find) end = middle - 1;
            if(arr[middle] < find) start = middle + 1;
        }

        return false;
    }    

}