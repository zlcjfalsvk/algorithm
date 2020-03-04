package PROGRAMMERS;

/**
 * P_level1.11
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class P_level1_11 {
    
    public String solution(int n) {
        StringBuilder stb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            stb.append(i % 2 == 0 ? "수" : "박");
        }
        return stb.toString();
    }
}