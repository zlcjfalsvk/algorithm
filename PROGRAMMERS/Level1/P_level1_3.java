package PROGRAMMERS.Level1;

import java.util.HashMap;
import java.util.Map;

/**
 * P_level1_2 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
class P_level1_3 {

    public static void main(String[] args) {
        P_level1_3 l = new P_level1_3();
        String[] a = { "kiki", "leo", "eden", "leo", "kiki" };
        String[] a2 = { "leo", "kiki", "eden", "kiki" };
        System.out.println(l.solution(a, a2));
        }

    // 위와 같이 하면 효율성에서 좋은 점수를 받지 못함
    // public String solution(String[] participant, String[] completion) {
    //     for (int i = 0; i < completion.length; i++) {
    //         for (int j = 0; j < participant.length; j++) {
    //             if(completion[i] == null) break;
    //             if(participant[j] != null && participant[j].equals(completion[i])){
    //                 participant[j] = null;
    //                 completion[i] = null;
    //                 break;
    //             }
    //         }
    //     }
    //     for (int j = 0; j < participant.length; j++) {
    //         if(participant[j]!= null) {
    //             return participant[j];
    //         } 
    //     }
    //     return "";
    // }

    // 해시를 이용한 방법
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> hash = new HashMap<>();
        
        for (String string : participant) {
            hash.put(string, hash.getOrDefault(string, 0) + 1);            
        }

        for (String string : completion) {
            hash.put(string, hash.get(string) - 1);            
        }

        for(Map.Entry<String, Integer> entry: hash.entrySet()) {
            if(entry.getValue() != 0) {
                return entry.getKey();
            }
        }
        return "";
    }
}