package A_20160627;

import java.util.Scanner;

public class A_3046 {

	public static void main(String[] args) {
		System.out.println("3046번");
		Scanner input = new Scanner(System.in);

		int r1 = input.nextInt();
		int s = input.nextInt();
		int r2 = (2 * s) - r1;
		System.out.println(r2);

		input.close();

	}

}
