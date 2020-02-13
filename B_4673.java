
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_4673 {
	public static void main(String[] args) {
		
		Integer[] dp = new Integer[10000];
		int index = 0;
		for (Integer i : dp) {
			dp[index] = index;
			index++;
		}

		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, dp);
		try {
			for (int i=0; i < dp.length ; i++) {
				int constructNUm = selfNum(dp[i]);
				if (list.indexOf(constructNUm) != -1) {
					list.remove(list.indexOf(constructNUm)); 
				}
			}
		} catch(Exception ee) {}
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	public static int selfNum(int ori) {
		String[] b = Integer.toString(ori).split("");
		int value = 0;
		for (String string : b) {
			value += Integer.parseInt(string);
		}
		value += ori;
		return value;
	}
}
