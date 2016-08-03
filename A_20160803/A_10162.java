package A_20160803;

import java.util.Scanner;

public class A_10162 {

	public static void main(String[] args) {
		System.out.println("A_10162 test");
		Scanner input = new Scanner(System.in);

		int T = input.nextInt();
		int countA = 0;
		int countB = 0;
		int countC = 0;
		// 버튼 A, B, C에 지정된 시간은 각각 300, 60, 10초이다.

		while (T >= 300) {
			T = T - 300;
			countA++;
		}

		while (T >= 60) {
			T = T - 60;
			countB++;
		}

		while (T >= 10) {
			T = T - 10;
			countC++;
		}

		if (T == 0) {
			System.out.println(countA + " " + countB + " " + countC);
		}

		else {
			System.out.println("-1");

		}
		input.close();

	}
}
