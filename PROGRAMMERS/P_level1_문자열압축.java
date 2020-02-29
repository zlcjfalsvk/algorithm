package PROGRAMMERS;

/**
 * P_level1_1 문자열 압축
 * https://programmers.co.kr/learn/courses/30/lessons/60057
 */
class P_level1_문자열압축 {

    public static void main(String[] args) {
        P_level1_문자열압축 sol1 = new P_level1_문자열압축();
        System.out.println(sol1.solution("aabbaccc"));
        System.out.println(sol1.solution("ababcdcdababcdcd"));
        System.out.println(sol1.solution("abcabcdede"));
        System.out.println(sol1.solution("abcabcabcabcdededededede"));
        System.out.println(sol1.solution("xababcdcdababcdcd"));
        System.out.println(sol1.solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        System.out.println(sol1.solution("abcabcad"));
    }

    public int solution(String s) {
        return solution(s, 1);
    }
    
    public static int solution(String s, int size) {
        if(s.length() == 1) { return s.length();}
        if(size > s.length() / 2) { return s.length(); }
        String saveWord = s.substring(0, size);
        StringBuilder stb = new StringBuilder();
        String gc = "";
        int cnt = 1;
        // 압축 사이즈가 string / size 보다 작아야한다.
        for(int i = 1; i < s.length() / size; i++) {
            String word = s.substring(i * size, i * size + size);
            // 전과 같다면 cnt ++을 해준다.
            if(saveWord.equals(word)) {
                cnt++;
                saveWord = word;
                gc = s.substring(i * size + size);
            } else { // 새로운 문자 준비
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
        // for 문 끝나고 나머지 처리
        if(cnt == 1) {
            stb.append(gc);
        } else {
            stb.append(cnt);
            stb.append(saveWord);
            stb.append(gc);
        } 
        // System.out.println(stb.toString() + " GC - " + gc);
        return Math.min(stb.length(), solution(s, ++size));
    }
}