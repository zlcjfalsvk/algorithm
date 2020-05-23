
package MAILPRO;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

/**
 * 반복된 알파벳으로 이루어진 문자배열이 주어지면 연속으로 중복된 알파벳이 없도록 문자배열을 재배열하여 리턴하시오. 불가능 하다면 empty
 * string을 리턴하시오. Given a string with repeated characters, rearrange the string
 * so that no two adjacent characters are the same. If this is impossible,
 * return an empty string.
 * 
 * input: "aaabbc" output: "ababac"
 * 
 * input: "aaac" output: ""
 * 
 * 
 * java에서 heap 구현하기 
 * https://stackoverflow.com/questions/14165325/is-there-a-heap-in-java
 */
public class M24_EmptyString {

    public static void main(String[] args) {
        System.out.println(solution("aaabbc"));
        System.out.println(solution("aaac"));
        System.out.println(solution("aaaabbc")); // ababaca
    }   
    
    public static String solution(String str) {
        String[] arr = str.split("");
        Map<String, Integer> countC = new HashMap<String, Integer>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder ret = new StringBuilder();

        for (String string : arr) {
            countC.put(string, countC.getOrDefault(string, 0) + 1);
        }

        for(Entry<String, Integer> entry : countC.entrySet()) {
            heap.add(entry.getValue());
        }
        int backup = 0;

        while(!heap.isEmpty()) {
            int value = heap.poll();
            int recycle = 0;

            for(Entry<String, Integer> entry : countC.entrySet()) {
                if(entry.getValue() == value) {
                    if(ret.length() > 0 && (ret.charAt(ret.length() -1) == entry.getKey().charAt(0))) {                
                        recycle++;
                        continue;
                    }
                    ret.append(entry.getKey());
                    recycle = 0;
                    if(value -1 != 0) { 
                        heap.add(value -1); 
                        countC.put(entry.getKey(), value -1);
                    } else {
                        countC.remove(entry.getKey());
                    }
                    if(backup != 0 ) {
                        heap.add(backup);
                        backup = 0;
                    }
                    break;
                }
            }

            if(recycle++ > 0) {
                backup = value;
            }
        }

        if(str.length() == ret.toString().length()) return ret.toString();
        else return "";
    }
}