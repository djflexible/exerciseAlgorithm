package A_20160802;

import java.util.Scanner;

public class A_1357 {

	public static void main(String[] args) {

		System.out.println("1357 문제");
		Scanner input = new Scanner(System.in);

		String str1 = input.next();
		String str2 = input.next();
		int k = 0;

		k = rev(str1) + rev(str2);
		String s = Integer.toString(k);

		System.out.println(rev(s));

		input.close();

	}

	static public int rev(String str) { // rev를 수행하는 함수
		String strArry[] = str.split("");
		String strCopy[] = new String[strArry.length];
		int strInt[] = new int[strArry.length];

		for (int i = strArry.length - 1; i >= 0; i--) {
			strCopy[i] = strArry[i];
			strInt[i] = Integer.parseInt(strCopy[i]);
		}

		if (strInt.length == 4) {
			return strInt[3] * 1000 + strInt[2] * 100 + strInt[1] * 10
					+ strInt[0];
		}

		if (strInt.length == 3) {
			return strInt[2] * 100 + strInt[1] * 10 + strInt[0];
		}

		if (strInt.length == 2) {
			return strInt[1] * 10 + strInt[0];
		}

		if (strInt.length == 1) {
			return strInt[0];
		}

		return -1;

	}

}
