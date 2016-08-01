package A_20160629;

import java.util.Scanner;

public class A_9325 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();// 자동차 수
		int t1 = 0;// 옵션 개수 1000이하
		int a[] = new int[t];// 자동차 가격
		int op[] = new int[1000];// 특정 옵션이 개수100이하
		int opPrice[] = new int[1000];// 특정 옵션이 개수100이하
		int opSum = 0;

		for (int i = 0; i < t; i++) {
			a[i] = input.nextInt();
			t1 = input.nextInt();

			if (t1 == 0) {
				opSum = 0;
				// break;
			}
			for (int j = 0; j < t1; j++) {
				op[j] = input.nextInt();
				opPrice[j] = input.nextInt();
				opSum = opSum + (op[j] * opPrice[j]);
			}
			a[i] = a[i] + opSum;
			opSum = 0;
		}

		for (int i = 0; i < t; i++) {
			System.out.println(a[i]);
		}
		input.close();
	}
}
