package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * B_2588
 */
public class B_2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(buf.readLine());
        String[] arr = buf.readLine().split(""); 
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.println(first * Integer.parseInt(arr[i]));            
        }
        System.out.println(first * Integer.parseInt(String.join("", arr)));
    }    
}