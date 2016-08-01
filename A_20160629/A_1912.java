package A_20160629;

import java.util.Scanner;

public class A_1912 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];// 숫자 저장
		int b[] = new int[n];
		int max = 0;

		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		for (int i = 1; i < n; i++) {
			b[0] = a[0];
			max = b[i - 1] + a[i];

			if (a[i] > max) {
				b[i] = a[i];
			} else
				b[i] = max;

			//System.out.println(b[i]);
		}
		// max = 0;
		for (int i = 0; i < n; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}

		System.out.println(max);
		input.close();
	}
}
