package PROGRAMMERS.Level1;

/**
 * 가운데 글자 가져오기
 * https://PROGRAMMERS.Level1.co.kr/learn/courses/30/lessons/12903
 */
public class P_level1_7 {

    public static void main(String[] args) {
        P_level1_7 start = new P_level1_7();
        System.out.println(start.solution("abcde"));
        System.out.println(start.solution("qwer"));
    }

    public String solution(String s) {
        int index = s.length() / 2;
        if(s.length() % 2 == 0 ) {
            return s.substring(index- 1, index + 1);
        } else {
            return s.charAt(index) + "";
        }
    }    
}