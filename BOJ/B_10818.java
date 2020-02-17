

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * B_10818
 */
public class B_10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String length = buf.readLine();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String[] arr = buf.readLine().split(" ");
        for (String string : arr) {
            min = Math.min(min, Integer.parseInt(string));
            max = Math.max(max, Integer.parseInt(string));
        }
        System.out.println(min + " " + max );
    }
}