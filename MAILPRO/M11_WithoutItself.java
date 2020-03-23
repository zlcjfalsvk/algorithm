package MAILPRO;

/**
정수로된 배열이 주어지면, 각 원소가 자신을 뺀 나머지 원소들의 곱셈이 되게하라.
단, 나누기 사용 금지, O(n) 시간복잡도
Given an integer array, make each element a product of all element values without itself.

예제)
input: [1, 2, 3, 4, 5]
output: [120, 60, 40, 30, 24]
 */
public class M11_WithoutItself {

    public static void main(String[] args) {

        solution(new int[] {1,2,3,4,5}); // 120, 60, 40, 30, 24
        // solution(new int[] {2,3,4,5,6}); // 360, 240, 180, 144, 120
        
    }

    public static int[] solution(int[] arr) {
        int[] dp = new int[arr.length];
        int now = arr[0];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = dp[i - 1] * now; 
            now = arr[i];
        }
        now = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            dp[i] *= now;
            now *= arr[i];
        }

        return dp;
    }    
}