package A_20160803;

import java.util.Scanner;

public class A_10998 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.next();
		String strArry[] = str.split("");
		int mid = strArry.length / 2;
		int count = 0;

		for (int i = 0; i < mid; i++) {
			if (strArry[i].equals(strArry[strArry.length - 1 - i])) {
				count++;
			}
		}

		if (count == mid) {
			System.out.println("1");

		} else {
			System.out.println("0");

		}

		input.close();

	}

}
