package PROGRAMMERS.Level2;

/**
 * 조이스틱
 * https://programmers.co.kr/learn/courses/30/lessons/42860
 */
public class P_level2_4 {
    static char[] a = new char[26];
    static char lashC;
    public static void main(String[] args) {
        // solution("JEROEN");
    }

    public static int solution(String name) {
        int answer = 0;
        setAlphabat();
        // 1. 첫번째 문자에서 더 가까운놈 찾기
        lashC = name.charAt(0);
        answer += Math.min(upCount('A', lashC), downCount('A', lashC));

        // 2. 왼쪽이나, 오른쪽 알파벳 중 목적지가 더 가까운 놈으로 이동
        // 3. 한 방향으로 쭉 가기
        return answer;
    }

    public static int solution(int searchStr, String name, int answer) {
        if(searchStr == name.length()) return answer;

        return 0;
    }

    public static int upCount(char startStr, char findStr) {
        int stI = (int) startStr % 65;
        int fiI = (int) findStr % 65;
        int count = 0;
        while (true) {
            count++;
            stI = (stI + 1) % 26;
            if(stI == fiI) {
                break;
            }
        }
        return count;
    }

    public static int downCount(char startStr, char findStr) {
        int stI = (int) startStr % 65;
        int fiI = (int) findStr % 65;
        int count = 0;
        while (true) {
            count++;
            fiI = (fiI + 1) % 26;
            if(stI == fiI) {
                break;
            }
        }
        return count;
    }

    public static void setAlphabat() {
        for(int i = 0; i < 26; i++) {
            a[i] = (char)('A' + i);
        }
    }
}