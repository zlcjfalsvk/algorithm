package BOJ.algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Al15552
 */
public class B_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bur = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stb = new StringBuilder();
        
        int num = Integer.parseInt(bur.readLine());
        for (int i = 0; i < num; i++) {
        		String str1 = bur.readLine();
        		String[] word = str1.split(" ");
        		stb.append((Integer.parseInt(word[0])+Integer.parseInt(word[1]))+"\n");
        }
        
        System.out.println(stb.toString());
    }
}