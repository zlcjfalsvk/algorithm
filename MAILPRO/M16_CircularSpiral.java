package MAILPRO;

/**
2차 정수 배열(2D int array)가 주어지면, 소용돌이 모양으로 원소들을 프린트하시오. 예제를 보시오.
Given a 2D integer array, print all elements in a circular spiral shape starting from [0][0]. See example.
예제)
input:
[[1, 2, 3],
 [8, 9, 4],
 [7, 6, 5]]

Output:
1, 2, 3, 4, 5, 6, 7, 8, 9
 */
public class M16_CircularSpiral {

    final static int [] DX = {0, 1, 0, -1};
    final static int [] DY = {1, 0, -1, 0};

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int totalSize = arr.length * arr[0].length;
        int dIndex = 0;
        int x = 0, y = 0;
        for(int i = 0; i < totalSize; i++) {
            visited[x][y] = true;
            System.out.println(arr[x][y]);
            int cr = x + DX[dIndex];
            int cc = y + DY[dIndex];
            /**
             * 방향 바꿔주기
             * 1. x | y len 길이가 클 때
             * 2. 다음 방향의 visit가 true일 때
             */
            if(cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length || visited[cr][cc] == true) {
                dIndex = (dIndex + 1) % 4;
                x += DX[dIndex];
                y += DY[dIndex];
            } else {
                x = cr;
                y = cc;
            } 
        }
    }
}