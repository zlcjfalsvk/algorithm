package BOJ;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Al9012
 */
public class B_9012 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int num = scan.nextInt();
		start(num);

	}

	public static void start(int num) {
		ArrayList<String> a = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			String str = scan.next();
			a.add(str);
		}
		for (int i = 0; i < num; i++) {
			System.out.println(myStack(a.get(i)));
		}
		
	}

	public static String myStack(String value) {

		Stack<String> stack = new Stack<>();
		for (String var : value.split("")) {
			stack.push(var.trim());
			if (stack.lastElement().equals(")")) {
				String last = stack.peek();
				stack.pop();
				while (stack.size() >= 0) {
					if (stack.size() > 0 && stack.lastElement().equals("(")) {
						stack.pop();
						break;
					} else {
						stack.push(last);
						break;
					}
				}
			}
		}

		return (stack.size() == 0) ? "YES" : "NO";
	}

}