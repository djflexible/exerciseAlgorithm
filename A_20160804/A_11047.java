package A_20160804;

import java.util.Scanner;

public class A_11047 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();// 동전 수
		int K = input.nextInt();// 값
		int count = 0;
		int mod = 0;
		int coin[] = new int[N];

		for (int i = 0; i < N; i++) {
			coin[i] = input.nextInt();
		}

		for (int i = N - 1; i >= 0; i--) {
			if (K >= coin[i]) {
				mod = K / coin[i];
				K = K % coin[i];
			}
			count = count + mod;
			mod = 0;
			
			if (K == 0)
				break;
		}
		System.out.println(count);
		input.close();

	}

}
