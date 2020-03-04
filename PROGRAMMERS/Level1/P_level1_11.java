package PROGRAMMERS.Level1;

/**
 * 수박수박수박수박
 * https://PROGRAMMERS.Level1.co.kr/learn/courses/30/lessons/12922
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