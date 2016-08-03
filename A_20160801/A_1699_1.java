package A_20160801;

import java.util.Scanner;

public class A_1699_1 {
	static int count = 0;
	static int count2 = 0;
	static int k = 0;

	// static int cNum[] = new int[2];

	public static void main(String[] args) {
		System.out.println("1699번_1");
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		// System.out.println(square(N));

		System.out.println(square(N));
		System.out.println(square2(N));

		input.close();
	}

	public static int square(int N) {
		int sNum = 1;

		if (N == 0) {
			return count;
		} else {
			while ((sNum * sNum) <= N) {
				sNum++;
			}
			sNum = sNum - 1; // 최대 제곱수
			N = N - (sNum * sNum);
			// System.out.println("sNum 변화 : " + sNum * sNum);
			// System.out.println("N 변화 : " + N);
			count++;
			return square(N);
		}

	}

	public static int square2(int N) {
		int sNum = 1;

		if (N == 0) {

			return count2;
		} else {

			if (k == 0) {
				
				while ((sNum * sNum) <= N) {
					sNum++;
				}
				sNum = sNum - 2; // 최대 제곱수, 6저장
				N = N - (sNum * sNum);
				// System.out.println("sNum 변화 : " + sNum * sNum);
				// System.out.println("N 변화 : " + N);
				count2++;
				k++;
				return square2(N);
				
			} else {
				while ((sNum * sNum) <= N) {
					sNum++;
				}
				sNum = sNum - 1; // 최대 제곱수, 6저장
				N = N - (sNum * sNum);
				// System.out.println("sNum 변화 : " + sNum * sNum);
				// System.out.println("N 변화 : " + N);
				count2++;
				return square2(N);
			}
		}

	}
}
