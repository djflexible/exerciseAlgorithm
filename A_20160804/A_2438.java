package A_20160804;

import java.util.Scanner;

public class A_2438 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		for (int i = 0; i < N; i++) {

			for (int j = 1; j <= i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		input.close();
	}
}
