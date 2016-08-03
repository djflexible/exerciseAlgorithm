package A_20160803;

import java.util.Scanner;

public class A_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		System.out.println(fact(N));

		sc.close();
	}

	public static int fact(int n) {
		if (n <= 1)
			return 1;
		else
			return fact(n - 1) * n;
	}
}
