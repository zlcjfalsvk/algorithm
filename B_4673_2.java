package BOJ.algorithm;

public class B_4673_2 {
	public static void main(String[] args) {
		boolean[] memo = new boolean[10000];

		for (int i = 0; i < memo.length; i++) {
			if (selfNum(i) < memo.length) {
				memo[selfNum(i)] = true;
			}
		}

		int index = 0;
		for (boolean b : memo) {
			if (b == false) {
				System.out.println(index);
			}
			index++;
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
