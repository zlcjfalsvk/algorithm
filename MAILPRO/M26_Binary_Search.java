package MAILPRO;


/**
 * 
 * 중복된 원소가 없는 정렬된 배열이 있습니다. 이 배열에서 원소의 값이 원소의 인덱스 값과 같다면 프린트 하시오. 시간복잡도 O(log n).
Given a sorted array of unique values, find an element where its value is equal to the index.

input: [-30, 1, 4, 60]
output: 1 // input[1] = 1

input: [0, 3, 10, 60]
output: 0 // input[0] = 0

input: [-40, -30, -20, 3]
output: 3 // input[3] = 3
 */
public class M26_Binary_Search {


    public static void main(String[] args) {
        // solution(new int[]{-30, 1, 4, 60}); // 1
        // solution(new int[]{0, 3, 10, 60}); // 0
        // solution(new int[]{-40, -30, -20, 3}); // 3
        solution(new int[]{-40, -30, 2 , 4 , 6 , 10 , 11 , 13 , 15 });
        // solution(new int[]{-40, -30, -20, 4 , 6 , 10});
    }

    public static void solution(int[] arr) {
        int left = 0 , right = arr.length - 1, mid = (left + right) / 2;
        String retV = null;

        while(left <= right) {
            if(arr[mid] > mid) {
                right = mid - 1;
            } else if (arr[mid] < mid) {
                left = mid + 1;
            } else {
                System.out.println(mid);
                return;
            }
            mid = (left + right) / 2;
        }
        if (retV == null) System.out.println("Null");        
    }
    
}