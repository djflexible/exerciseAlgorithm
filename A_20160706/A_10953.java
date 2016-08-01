package A_20160629;

import java.util.Scanner;

public class A_10953 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		String a[] = new String[t];
		int b[] = new int[t];

		for (int i = 0; i < t; i++) {
			a[i] = input.next();
			a[i] = a[i].replace(",", "");
		}
		for (int i = 0; i < t; i++) {
			b[i] = Integer.parseInt(a[i]);
			System.out.println(((b[i] - (b[i] % 10)) / 10) + (b[i] % 10));
		}
		input.close();
	}
}
