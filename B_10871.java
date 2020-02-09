package BOJ.algorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String[] input = bfr.readLine().split(" ");
		
		String[] matirx = bfr.readLine().split(" ");
		
		bfw.write(compare(matirx, Integer.parseInt(input[1])));
		bfw.flush();
		bfw.close();
					
	}
	
	public static String compare(String[] list, int a) {
		String ret = "";
		for (String string : list) {
			if (Integer.parseInt(string) < a) ret+=string + " ";
		}
		return ret;
	}
}
