package A_20160616;

import java.util.Scanner;

public class Main {

	public static long factory(long r) {

		if (r <= 1)
			return r;

		else
			return factory(r - 1) * r;

	}

	public static void main(String[] args) {

		System.out.println("작은 수, 큰 수");

		int arry[][] = new int[30][30];

		for (int i = 0; i < 30; i++) {

			arry[0][i] = i + 1;

		}
		for (int i = 1; i < 30; i++) {

			for (int j = 1; j < 30; j++) {

				arry[i][j] = arry[i - 1][j - 1] + arry[i][j - 1];
			}

		}

		int count = 0;
		int n = 0;
		int m = 0;

		Scanner input = new Scanner(System.in);

		count = input.nextInt();
	}
}
