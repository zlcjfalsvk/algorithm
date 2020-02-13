

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * B_17468
 */
public class B_17468 {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = buf.readLine().split(" ");
        BigInteger value = BigInteger.ONE;
        BigInteger one = BigInteger.valueOf(Long.parseLong(arr[0]));
        BigInteger two = BigInteger.valueOf(Long.parseLong(arr[1]));

        for (BigInteger bi = one; bi.compareTo(BigInteger.ZERO) > 0; bi = bi.subtract(BigInteger.ONE)) {
            value = value.multiply(bi);
        }
        System.out.println(value.mod(BigInteger.valueOf(Long.parseLong(arr[1]))));
    }
}