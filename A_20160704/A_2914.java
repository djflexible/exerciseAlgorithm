package A_20160704;

import java.util.Scanner;

public class A_2914 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a * (b - 1) + 1;
		System.out.println(c);
		input.close();
	}

}
