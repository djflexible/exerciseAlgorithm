package A_20160803;

import java.util.Scanner;

public class A_10870 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int num[] = new int[21];

		num[0] = 0;
		num[1] = 1;

		for (int i = 2; i < 21; i++) {
			num[i] = num[i - 1] + num[i - 2];
			//System.out.println(num[i]);
		}

		System.out.println(num[N]);
		input.close();
	}

}
