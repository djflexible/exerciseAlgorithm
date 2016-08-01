package A_20160704;

import java.util.Scanner;

public class A_12864 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("2864번");
		int min = 0;
		int max = 0;
		String a = input.next();
		String b = input.next();

		max = Integer.parseInt(a.replace("5", "6"))
				+ Integer.parseInt(b.replace("5", "6"));
		min = Integer.parseInt(a.replace("6", "5"))
				+ Integer.parseInt(b.replace("6", "5"));
		System.out.println(min + " " + max);
		input.close();
	}
}
