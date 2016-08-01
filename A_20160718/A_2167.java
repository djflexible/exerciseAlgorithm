package A_20160718;

import java.util.Scanner;

public class A_2167 {

	public static void main(String[] args) {

		System.out.println("2168번");

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int M = input.nextInt();
		int k = 0;
		int arry[][] = new int[N][M];

		for (int i = 0; i < N; i++) { // 배열 생성
			for (int j = 0; j < M; j++) {
				arry[i][j] = input.nextInt();
			}
		}

		k = input.nextInt();
		int a, b, c, d = 0;
		int sum = 0;
		int sumArry[] = new int[k];

		for (int i = 0; i < k; i++) {
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			d = input.nextInt();

			for (int i2 = (a - 1); i2 < c; i2++) { // 배열 탐색
				for (int j2 = (b - 1); j2 < d; j2++) {
					sum = sum + arry[i2][j2];
				}
			}
			sumArry[i] = sum;
			sum = 0;
		}

		for (int i = 0; i < k; i++) {
			System.out.println(sumArry[i]);
		}
		input.close();
	}

}
