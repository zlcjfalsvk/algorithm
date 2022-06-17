package MAILPRO;

/**
0과 1로 만들어진 2D 정수 배열이 있습니다. 0은 장애물이고 1은 도로일때, 두 좌표가 주어지면, 
첫번째 좌표에서 두번째 좌표까지 가장 가까운 거리를 구하시오. 
두 좌표는 모두 도로에서 시작되고 좌, 우, 아래, 위로 움직이며 대각선으로는 움직일 수 없습니다. 만약 갈 수 없다면 -1을 리턴하시오.

Given a 2D array with 0s and 1s, 0 represents an obstacle and 1 represents a road. 
Find the closest distance between two given points. You must only move up down right left. You cannot move through an obstacle.

예제)
Input:
{{1, 0, 0, 1, 1, 0},
{1, 0, 0, 1, 0, 0},
{1, 1, 1, 1, 0, 0},
{1, 0, 0, 0, 0, 1},
{1, 1, 1, 1, 1, 1}}
Start: (0, 0)
Finish: (0, 4)
Output: 8
 */
public class M15_2DArray {

    public static void main(String[] args) {
        
        int[][] arr = {{1, 0, 0, 1, 1, 0},
                        {1, 0, 0, 1, 0, 0},
                        {1, 1, 1, 1, 0, 0},
                        {1, 0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1}};
        int[] start = {0, 0};
        int[] finish = {0, 4};

        System.out.println(solution(arr, 0, start, finish, start, "N"));
    }


    public static int solution(int[][] arr, int anw, int[] start, int[] fin, int[] now, String way) {

        // 도착 했을 시
        if(fin[0] == now[0] && fin[1] == now[1]) return anw;
        // 맵 탈주
        if(now[0] > (arr.length -1) || now[1] > (arr[0].length -1) || now[0] < 0 || now[1] < 0) return Integer.MAX_VALUE;
        // 장애물
        if(arr[now[0]][now[1]] == 0) return Integer.MAX_VALUE;

        int up = Integer.MAX_VALUE, down = Integer.MAX_VALUE, left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;

        // 4방향으로 완전탐색 해야함
        // 상
        if(!way.equals("D")) up = solution(arr, anw + 1, start, fin, new int[]{now[0] - 1, now[1]}, "U");
        // 하
        if(!way.equals("U")) down = solution(arr, anw + 1, start, fin, new int[]{now[0] + 1, now[1]}, "D");
        // 좌
        if(!way.equals("R")) left = solution(arr, anw + 1, start, fin, new int[]{now[0], now[1] - 1}, "L");
        // 우
        if(!way.equals("L")) right = solution(arr, anw + 1, start, fin, new int[]{now[0], now[1] + 1}, "R");

        return Integer.min(up, Integer.min(down, Integer.min(left, right)));
    }
    
}