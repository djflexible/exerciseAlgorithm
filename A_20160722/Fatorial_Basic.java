package A_20160722;

import java.util.Scanner;

public class Fatorial_Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		System.out.println(fact(N));

	}

	public static int fact(int n) {
		if (n <= 1)
			return n;
		else
			return fact(n - 1) * n;

	}

}
