package A_20160629;

import java.util.Scanner;

public class A_1712 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int k = 0;

		if (c - b <= 0) {
			k = -1;
		}

		else {
			k = a / (c - b) + 1;

			if ((k > 0) && (k < 1)) {
				k = -1;
			}
			
		}
		System.out.println(k);

		input.close();

	}

}
