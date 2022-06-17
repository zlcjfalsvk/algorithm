package MAILPRO;

/**
"Look and say" sequence (보고 말하는 수열)은 다음과 같습니다.
    1 - 1개의 1
    11 - 2개의 1
    21 - 1개의 2, 1개의 1
    1211 - 1개의 1, 1개의 2, 2개의 1
    111221 - ...

    위와 같이 수열의 N 번째 수는 N-1번째 수의 조합을 풀어놓은 수 입니다.
    정수 N이 주어졌을때, "Look and say" 수열의 N번째 수까지 프린트 하시오.
    Given an integer N, print the first N numbers in "look and say" sequence.
 */
public class M29_LookAndSay {

    public static void main(String[] args) {
        solution(5);
    }

    public static void solution(int num) {
        StringBuilder sb = new StringBuilder("11");
        String[] s = sb.toString().split("");
        for(int i=0;i<num;i++) {
            System.out.println(sb.toString());
            s = sb.toString().split("");
            String ss = s[0];
            sb = new StringBuilder();
            int cnt = 0;
            for(int j=0;j<s.length;j++) {
                if(ss.equals(s[j])) { cnt++; }
                else {
                    sb.append(ss+""+cnt);
                    ss = s[j];
                    cnt = 1;
                }
            }
            if(cnt >= 1) {
                sb.append(ss+""+cnt);
                cnt = 1;
            }
        }
    }    
}