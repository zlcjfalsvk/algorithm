package PROGRAMMERS.Level2;

import java.util.Arrays;


/**
 * 조이스틱
 * https://programmers.co.kr/learn/courses/30/lessons/42860
 */
public class P_level2_4 {

    public static void main(String[] args) {
        System.out.println(solution("JAZ"));
        System.out.println(solution("JEROEN"));
        System.out.println(solution("JAN"));
        
    }



    // 탐욕법이 아님...
    // https://keepgoing0328.tistory.com/m/71?category=851292
    public static int solution(String name) {
        int answer = 0;
        String[] aname = name.replaceAll("\\S", "A").split("");
        int min = findMin('A', name.charAt(0));
        answer += min;
        aname[0] = name.charAt(0) + "";
        if(name.equals(String.join("", aname))) return answer;
        int r = findRecuit(Arrays.copyOf(aname, aname.length), name, "R", 1, answer);
        int l = findRecuit(Arrays.copyOf(aname, aname.length), name, "L", name.length() - 1, answer);                
        return Math.min(r, l);
    }

    public static int findRecuit(String[] find, String name, String way, int pm, int answer) {
        if(name.equals(String.join("", find))) return answer;
        int min = findMin('A', name.charAt(pm));
        find[pm] = name.charAt(pm) + "";
        return findRecuit(find, name, way, way.equals("R") ? (pm += 1) : (pm -= 1), answer += min + 1);
    }

    public static int findMin(char a, char b) {
        int min = Math.abs(a - b);
        return Math.min(min, 26 - min);
    }
}