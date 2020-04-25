package MAILPRO;


/**
 * 정수 배열 arr이 있습니다. arr안의 각 원소의 값은 다음 원소의 인덱스입니다. 이렇게 서로 이어지는 원소들의 배열이 있을때, arr[0]부터 시작하여 모든 원소를 들린 다음 다시 arr[0]로 도착할 수 있는지 찾으시오.
단, 시간복잡도는 O(n), 공간복잡도는 O(1).

예제)

Input: [1, 2, 4, 0, 3]
Output: True
// 1 -> 2 -> 4 -> 3 -> 0 -> 1

Input: [1, 4, 5, 0, 3, 2]
Output: False
// 1 -> 4 -> 3 -> 0 -> 1
// arr[2], arr[5]를 들리지 않았습니다.

Input: [1, 2, 2, 0]
Output: False
// 1 -> 2 -> 2 -> 2 -> …

// arr[0]로 돌아오지 못합니다.
 */
public class M17_Circuit {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 4, 0, 3})); // t
        System.out.println(solution(new int[]{1, 4, 5, 0, 3, 2})); // t
        System.out.println(solution(new int[]{1, 2, 2, 0} )); // f
    }

    // public static boolean solution(int[] arr) {
    //     boolean ret = true;
    //     boolean[] visit = new boolean[arr.length];
    //     for(int item: arr)  {
    //         if(visit[item]) break;
    //         visit[item] = true;
    //     }
    //     for (boolean b : visit) {
    //         if(!b) {
    //             ret = false;
    //             break;
    //         }
    //     }
    //     return ret;
    // }

    public static boolean solution(int[] arr) {
        int startIndex = 0;
        int index = startIndex;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && index == startIndex) {
                return false;
            }
            index = arr[index];
        }
        if (index == startIndex) {
            return true;
        }
        return false;
    }

}