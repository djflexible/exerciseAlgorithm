package A_20160804;

import java.util.Scanner;

public class A_2480 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dice[] = new int[3];
		int max = 0;
		int sum = 0;

		for (int i = 0; i < dice.length; i++) {
			dice[i] = input.nextInt();
		}

		for (int i = 0; i < dice.length; i++) {// 최대 값 출력
			if (max < dice[i]) {
				max = dice[i];
			}
		}

		if ((dice[0] != dice[1]) && (dice[0] != dice[2])
				&& (dice[1] != dice[2])) {// 모두 다름
			sum = max * 100;
		}

		if (dice[0] == dice[1]) {// 2개 같음
			sum = 1000 + dice[0] * 100;
		}
		if (dice[0] == dice[2]) {// 2개 같음
			sum = 1000 + dice[0] * 100;
		}
		if (dice[1] == dice[2]) {// 2개 같음
			sum = 1000 + dice[1] * 100;
		}

		if ((dice[0] == dice[1]) && (dice[1] == dice[2])) {// 모두 같음
			sum = 10000 + dice[0] * 1000;
		}

		System.out.println(sum);

		input.close();

	}
}
