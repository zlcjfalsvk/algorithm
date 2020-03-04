package PROGRAMMERS.Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 모의고사 https://PROGRAMMERS.Level1.co.kr/learn/courses/30/lessons/42840
 */
public class P_level1_5 {

    final static int[] SUPOJA1 = { 1, 2, 3, 4, 5 };
    final static int[] SUPOJA2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
    final static int[] SUPOJA3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,4,2}));
    }

    public static int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("1", 0);
        hash.put("2", 0);
        hash.put("3", 0);

        for (int i = 0; i < answers.length; i++) {
            int s = answers[i];
            if(s == SUPOJA1[i % SUPOJA1.length]) hash.put("1", hash.get("1") + 1);         
            if(s == SUPOJA2[i % SUPOJA2.length]) hash.put("2", hash.get("2") + 1);         
            if(s == SUPOJA3[i % SUPOJA3.length]) hash.put("3", hash.get("3") + 1);         
        }
        
        int max = Math.max(hash.get("1"), Math.max(hash.get("2"), hash.get("3")));
        if (max == hash.get("1")) answer.add(1);
        if (max == hash.get("2")) answer.add(2);
        if (max == hash.get("3")) answer.add(3);


        return answer.stream().mapToInt(i -> i).toArray();
    }
}