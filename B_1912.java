package BOJ.algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1912 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bre = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bre.readLine());
		String[] array = new String[num];
		int[] dp = new int[num+1];
		String str = bre.readLine();
		array = str.split(" ");
		Arrays.fill(dp, -1001);
		
		int index = 0;
		for (String i : array) {
			dp[index + 1] = Integer.max(dp[index] + Integer.parseInt(i),Integer.parseInt(i));		
			index++;
		}
		Arrays.sort(dp);
		System.out.println(dp[index]);

	}
}
