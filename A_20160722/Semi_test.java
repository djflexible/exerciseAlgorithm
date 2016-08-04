package A_20160722;

import java.util.Scanner;

public class Semi_test {

	public static void main(String[] args) {
		System.out.println("HackerEarth Semi Test");
		Scanner input = new Scanner(System.in);

		int T = input.nextInt();
		int tArry[] = new int[T];
		String tArry2[] = new String[T];

		for (int i = 0; i < T; i++) {
			tArry[i] = i + 1;

			if ((i + 1) % 5 == 0) {
				tArry[i] = 5;
			}
			if ((i + 1) % 3 == 0) {
				tArry[i] = 3;
			}
			if ((i + 1) % 15 == 0) {
				tArry[i] = 0;
			}
			tArry2[i] = Integer.toString(tArry[i]);
		}

		for (int i = 0; i < T; i++) {

			if ((i + 1) % 5 == 0) {
				tArry2[i] = "Buzz";
			}
			if ((i + 1) % 3 == 0) {
				tArry2[i] = "Fizz";
			}
			if ((i + 1) % 15 == 0) {
				tArry2[i] = "Fizz Buzz";
			}
			System.out.println(tArry2[i]);
		}
		input.close();
	}
}
