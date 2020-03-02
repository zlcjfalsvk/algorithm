package MAILPRO;

import java.util.ArrayList;
import java.util.List;

/**
 간격(interval)로 이루어진 배열이 주어지면, 겹치는 간격 원소들을 합친 새로운 배열을 만드시오. 간격은 시작과 끝으로 이루어져 있으며 시작은 끝보다 작거나 같습니다.
    Given a list of intervals, merge intersecting intervals.

    예제)
    Input: {{2,4}, {1,5}, {7,9}}
    Output: {{1,5}, {7,9}}

    Input: {{3,6}, {1,3}, {2,4}}
    Output: {{1,6}}
 */
public class M5_Interval {

    public static void main(String[] args) {
        M5_Interval start = new M5_Interval();        
        // System.out.println(start.solution(new int[][]{{2, 4},{1, 5},{7, 9}}));
        // System.out.println(start.solution(new int[][]{{2, 6},{1, 3},{2, 4}}));
        // System.out.println(start.solution(new int[][]{{1, 9}, {1, 3}, {2, 4}, {8 ,11}, {12 ,13}, {14 ,16}}));
    }
    
    public List<Interval> solution(int[][] arr) {
        sort(0, arr);
        List<Interval> answer = new ArrayList<>();
        answer.add(new Interval(arr[0][0], arr[0][1]));
        for(int i = 1; i < arr.length; i++) {
            Interval inter = new Interval(arr[i][0], arr[i][1]);
            if(answer.get(answer.size() - 1).end < inter.first) {
                answer.add(inter);
            } else {
                answer.get(answer.size() - 1).end = 
                    Math.max(inter.end, answer.get(answer.size() - 1).end);
            }            
        }   
        return answer;
    }

    private static void sort(int index, int[][] arr) {
        if(index >= arr.length - 1) return;
        
        if(arr[0][0] > arr[1][0]) {
            int[] temp = new int[2];
            temp[0] = arr[0][0]; 
            temp[1] = arr[0][1];
            arr[0][0] = arr[1][0];
            arr[0][1] = arr[1][1];
            arr[1][0] = temp[0];
            arr[1][1] = temp[1];           
        }
        sort(index + 1, arr);
    }


    private class Interval{
        private int first;
        private int end;   

        public Interval(int f, int e) {
            this.first = f;
            this.end = e;
        }

        public void set(int f, int e) {
            this.first = f;
            this.end = e;
        }
    }

}