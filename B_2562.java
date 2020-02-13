

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * B_2562
 */
public class B_2562 {

    public static void main(String[] args) throws IOException {
		BufferedReader bre = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < 9; i ++) {
            int a = Integer.parseInt(bre.readLine());
            max = Math.max(a, max);
            if (max == a) {
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}