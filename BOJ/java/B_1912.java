package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1912 {
	
	public static void main(final String[] args) throws NumberFormatException, IOException {
		final BufferedReader bre = new BufferedReader(new InputStreamReader(System.in));
		final int num = Integer.parseInt(bre.readLine());
		String[] array = new String[num];
		final int[] dp = new int[num + 1];
		final String str = bre.readLine();
		array = str.split(" ");
		Arrays.fill(dp, -1001);

		int index = 0;
		for (final String i : array) {
			dp[index + 1] = Integer.max(dp[index] + Integer.parseInt(i),Integer.parseInt(i));		
			index++;
		}
		Arrays.sort(dp);
		System.out.println(dp[index]);

	}
}
