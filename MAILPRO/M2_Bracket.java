package MAILPRO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * M2_Bracket
 */
public class M2_Bracket {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3)));
    }
    
    public static String[] solution(int n) {
        List<String> arr = new ArrayList<>();
        solution(n, arr, "", 0, 0);
        return arr.toArray(new String[arr.size()]);
    }

    public static void solution(int n, List<String> arr, String str, int a, int b) {
        if(str.length() == (n * 2)) { arr.add(str); return;}
        if(a < n) {
            solution(n, arr, str.concat("("), a + 1, b);
        }
        if(b < a) {
            solution(n, arr, str.concat(")"), a, b + 1);
        }
    }
}