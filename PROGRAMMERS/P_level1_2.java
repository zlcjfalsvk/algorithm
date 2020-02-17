
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * P_level1_2 완주하지 못한 선수
 */
class P_level1_2 {

    public static void main(String[] args) {
        P_level1_2 l = new P_level1_2();
        String[] a = { "kiki", "leo", "eden", "leo", "kiki" };
        String[] a2 = { "leo", "kiki", "eden", "kiki" };
        System.out.println(l.solution(a, a2));
    }

    public String solution(String[] participant, String[] completion) {
        for (int i = 0; i < completion.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                if(completion[i] == null) break;
                if(participant[j] != null && participant[j].equals(completion[i])){
                    participant[j] = null;
                    completion[i] = null;
                    break;
                }
            }
        }

        for (int j = 0; j < participant.length; j++) {
            if(participant[j]!= null) {
                return participant[j];
            } 
        }
        return "";
    }
}