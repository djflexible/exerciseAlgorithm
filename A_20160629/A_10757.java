package A_20160629;

import java.math.BigInteger;
import java.util.Scanner;

public class A_10757 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger a = input.nextBigInteger();
		BigInteger b = input.nextBigInteger();

		System.out.println(a.add(b));
		input.close();
	}
}
