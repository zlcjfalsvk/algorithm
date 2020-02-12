class Solution {


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
                gc = s.substring(i * size);
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
        } 
        // System.out.println(stb.toString() + " GC - " + gc);
        return Math.min(stb.length(), solution(s, ++size));
    }
}