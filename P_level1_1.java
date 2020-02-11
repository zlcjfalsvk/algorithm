/**
 * 문자열압축
 */
public class P_level1_1 {

    public static void main(String[] args) {
        P_level1_1 start = new P_level1_1();
        // System.out.println(start.solution("aabbaccc", 1)); // 7
        // System.out.println(start.solution("abcabcdede", 1)); // 8
        // System.out.println(start.solution("abcabcabcabcdededededede", 1)); // 14
        System.out.println(start.solution("xababcdcdababcdcd",1 )); // 17

    }

    public static int solution(String s, int size) {
        if(size > s.length() / 2) { return s.length(); }
        String saveWord = s.substring(0, size);
        StringBuilder stb = new StringBuilder();
        String gc = "";
        int cnt = 1;
        for(int i = 1; i < s.length() / size; i++) {
            String word = s.substring(i * size, i * size + size);
            if(saveWord.equals(word)) {
                cnt++;
                saveWord = word;
                gc = s.substring(i * size);
            } else {
                if(cnt == 1) {
                    stb.append(saveWord);
                } else {
                    stb.append(cnt);
                    stb.append(saveWord);
                } 
                cnt = 1;
                saveWord = word;
                gc = s.substring(i * size);
            }
        }
        if(cnt == 1) {
            stb.append(gc);
        } else {
            stb.append(cnt);
            stb.append(saveWord);
        } 
        // System.out.println(stb.toString() + " GC - " + gc);
        return Math.min(stb.length(), solution(s, ++size));
    }
}