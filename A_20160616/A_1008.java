package A_20160616;

import java.util.Scanner;

public class A_1008 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a = 0;
		double b = 0;

		a = input.nextInt();
		b = input.nextInt();

		System.out.printf("%04.10f", a / b);
	}

}
