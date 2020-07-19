package MAILPRO;

/**
정수 배열과 정수 K가 주어지면 원소 3개의 합으로 K가 만들어지는지 체크하시오.
Given an integer array and an integer K, check if sum of 3 elements from the array equals to K.
 */
public class M31_Sum {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 0, 10, 6, 4 }, 10)); // true
        System.out.println(solution(new int[]{3, 1, 2, -1, 10, 7, 11 }, 50)); // false
    }
    
    public static boolean solution(int[] arr, int k) {
        quickSort(arr, 0, arr.length -1 );

        for(int i = 0; i < arr.length - 2 ; i++) {
            if(find(arr, k - arr[i], i + 1)) return true;
        }
        
        return false;
    }

    public static boolean find(int arr[], int k, int start) {
        int left = start, right = arr.length - 1;
        while(left < right) {
            if(arr[left] + arr[right] == k) return true;
            else if(arr[left] + arr[right] < k) left += 1;
            else right -=1;    
        }
        return false;
    }

    public static void quickSort(int[] arr, int l, int r) {

        if(l < r) {
            int pivot = getPivot(arr, l, r);

            quickSort(arr, l, pivot);
            quickSort(arr, pivot + 1, r);
        }
    }

    public static int getPivot(int[] arr, int l, int r) {

        int pivot = (l + r) / 2;
        while( l < r ) {
            while(arr[l] < arr[pivot] && l < r) l++;
            while(arr[r] > arr[pivot] && l < r) r--;
            if( l < r ) {
                int swap = arr[l];
                arr[l] = arr [r];
                arr[r] = swap;
            }
        }
        return l;
    }
}