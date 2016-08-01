package A_20160621;

import java.util.Scanner;

public class A_1111 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();// 50이하 자연수

		int arry[] = new int[size];// 100이하 절댓값 3, 6, 12, 24, 48 == 1,4,13,40
									// 121
		int a = 0;
		int b = 0;
		int next = 0;

		for (int i = 0; i < size; i++) {
			arry[i] = input.nextInt();

		}

		if ((size > 50) || (size == 1)) {
			System.out.println("B");

		}

		else if ((arry[size - 1] == 0) || (arry[size - 2] == 0)) { // 1, 0, 0
			System.out.println("B");

		}

		else if ((arry[1] == (arry[0] * arry[size - 1] / arry[size - 2] + arry[size - 1]
				% arry[size - 2]))
				&& ((arry[size - 1] <= 100) && (arry[size - 1] >= -100))) {

			a = arry[size - 1] / arry[size - 2];
			b = arry[size - 1] % arry[size - 2];

			next = arry[size - 1] * a + b;

			System.out.println(next);
		}

		else

			System.out.println("Bd");

		// System.out.println(chk);

	}

}
