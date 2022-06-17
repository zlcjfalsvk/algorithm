package BOJ;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class B_11721 {
	 static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		final String regex = ".{1,10}";
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		String string = scan.next();

		final Matcher matcher = pattern.matcher(string);

		while (matcher.find()) {
		    System.out.println(matcher.group(0));
		}
	}
	
}
