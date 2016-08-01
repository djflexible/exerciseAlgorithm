package A_20160627;

import java.util.Scanner;

public class A_1932 {

	public static void main(String[] args) {
		System.out.println("1932번 모름");

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int sumArry[][] = new int[size * 2][size * 2];
		int sum = 0;
		int arry[][] = new int[size * 2][size * 2];
		int k = size - 1;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - k; j++) {
				arry[i][j] = input.nextInt();

			}
			k--;
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println(i + ", " + j + " : " + arry[i][j]);
			}

		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				 sumArry[i][j] = arry[i][j] + arry[i + 1][j];

				System.out.println(i + ", " + j + " : " + sumArry[i][j]);

			}

		}

		input.close();

	}

}
