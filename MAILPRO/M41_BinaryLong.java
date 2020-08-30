package MAILPRO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 0과 1로만 구성된 바이너리 배열이 주어졌을 때, 0과 1의 원소의 수가 같은 최대 길이의 부분 배열을 구하시오. 부분 배열은 배열 내의
 * 연속된 원소들의 집합입니다.
 * 
 * Input: [0, 0, 1, 0, 1, 0, 0] Output: [0, 1, 0, 1] 또는 [1, 0, 1, 0]
 */
public class M41_BinaryLong {

    public static void main(String[] args) {
        int[] arr1 = new int[] { 0, 0, 1, 0, 1, 0, 0 };
        // solution1(arr1);
        maxLenSubarray(arr1);
    }

    public static void solution1(int[] arr) {
        int zeroCnt = 0, oneCnt = 0;
        for (int item : arr) {
            if (item == 1) {
                oneCnt++;
            } else {
                zeroCnt++;
            }
        }

        int length = Math.min(zeroCnt, oneCnt) * 2;
        for (int i = 0; i < arr.length; i++) {
            if (i + length >= arr.length)
                break;
            int zero = 0, one = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = i; j <= i + length; j++) {
                if (Math.min(zeroCnt, oneCnt) == zero && Math.min(zeroCnt, oneCnt) == one) {
                    System.out.println(Arrays.toString(list.toArray()));
                    break;
                } else {
                    list.add(arr[j]);
                }

                if (arr[j] == 1) {
                    one++;
                } else {
                    zero++;
                }
            }
        }
    }

    public static void maxLenSubarray(int[] A) {
        // 부분 배열의 합을 키로,
        // 해당 부분 배열의 마지막 인덱스를 저장하는 해쉬 맵 생성
        Map<Integer, Integer> map = new HashMap<>();

        // 인덱스 0부터 시작하는 부분 배열의 합이 S인 경우를 처리하기 위해
        // (0, -1)을 맵에 삽입
        map.put(0, -1);

        // 원소의 합이 S인 가장 긴 부분 배열의 길이를 저장하는 변수
        int len = 0;

        // 원소의 합이 S인 가장 긴 부분 배열의 마지막 인덱스를 저장하는 변수
        int ending_index = -1;

        int sum = 0;

        // 주어진 배열을 순회
        for (int i = 0; i < A.length; i++) {
            // 현재까지의 원소들의 합 계산 (0은 -1로 계산)
            sum += (A[i] == 0) ? -1 : 1;

            // 계산된 합과 같은 값이 이전에 있는 경우
            if (map.containsKey(sum)) {
                // 합이 0인 부분 배열을 찾고 가장 긴 부분 배열이라면
                // 길이와 마지막 인덱스를 업데이트
                if (len < i - map.get(sum)) {
                    len = i - map.get(sum);
                    ending_index = i;
                }
            }
            // 계산된 합과 같은 값이 이전에 없었다면 합과 인덱스를 맵에 삽입
            else {
                map.put(sum, i);
            }
        }

        // 조건을 만족하는 부분 배열이 있다면 시작 인덱스와 마지막 인덱스를 출력
        if (ending_index != -1) {
            System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
        } else {
            System.out.println("조건을 만족하는 부분 배열이 없음");
        }
    }
}