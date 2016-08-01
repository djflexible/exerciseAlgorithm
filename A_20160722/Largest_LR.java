package A_20160722;

import java.util.Scanner;

public class Largest_LR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String arry[] = str.split("");
		String arry1[] = new String[arry.length];

		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + ", ");
		}
		System.out.println("//");

		for (int j = 0; j < arry1.length; j++) {
			String k = arry[0];
			for (int i = 0; i < arry.length; i++) {

				if (i == (arry.length - 1)) {
					arry[arry.length - 1] = k;
				}
				if (i != (arry.length - 1)) {
					arry[i] = arry[i + 1];
				}
			}
			System.out.print(arry[j] + ", ");
			arry1[j] = arry[j];
		}
		for (int i = 0; i < arry1.length; i++) {
			System.out.print(arry[i] + ", ");
		}

		sc.close();

	}
}
