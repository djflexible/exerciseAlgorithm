package A_20160801;

import java.util.Scanner;

public class A_1699_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int arry[] = new int[N + 1];
		System.out.println("1699_정답");

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j * j <= i; j++) {
				if (arry[i] > arry[i - j * j] + 1 || arry[i] == 0) {
					arry[i] = arry[i - j * j] + 1;
				}
			}
		}
		System.out.println(arry[N]);
		input.close();
	}
}
