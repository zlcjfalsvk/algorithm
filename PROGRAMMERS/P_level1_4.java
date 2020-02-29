package PROGRAMMERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * K번째수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class P_level1_4{


    public static void main(final String[] args) {
        int[] answer = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        int[] a = solution(answer, commands);
        System.out.println(a);
    }

    public static int[] solution(final int[] array, final int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            final int startIndex = commands[i][0] - 1;
            final int endIndex = commands[i][1];
            final int findIndex = commands[i][2] - 1;
            answer.add(solution(Arrays.copyOfRange(array, startIndex, endIndex), startIndex, endIndex, findIndex));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int solution(int[] arr, final int startI, final int endI, final int findI) {
        Arrays.sort(arr);
        return arr[findI] ;
    }
} 