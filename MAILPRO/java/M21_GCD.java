package MAILPRO;

/**
정수 배열이 주어지면 , 배열 안의 모든 정수의 최대 공약수(GCD)를 구하시오.
시간 복잡도 제한 O(n)

Given an integer array, find the greatest common denominator of all elements.

input: [3, 2, 1]
output: 1

input: [2, 4, 6, 8]
output: 2
 */
public class M21_GCD {

    public static void main(String[] args) {
        // System.out.println(solve(new int[]{3,2,1}));
        // System.out.println(solve(new int[]{2,4,6,8}));    
        // System.out.println(solve(new int[]{3,4,7,8})); 
        
        System.out.println(gcd(3, 5));
        System.out.println(getGcd(3, 5));
    }

    public static int solve(int[] arr) {
        int now = arr[0];
        for(int i = 1 ; i < arr.length ; i++) {
            now = getGcd(now, arr[i]);
        }
        return now;
    }

    public static int getGcd(int a, int b) {
        if(a % b == 0) {
            return b;
        } 
        return getGcd(b, a % b);
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}