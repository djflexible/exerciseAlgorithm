package A_20160719;

//큰수의 팩토리얼과 나누기
import java.math.BigInteger;
import java.util.Scanner;

public class HE_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		BigInteger b = input.nextBigInteger();

		HE_1 test = new HE_1();
		System.out.println(test.factorial(a, b));

		input.close();
	}

	public static BigInteger factorial(int n, BigInteger m) {
		BigInteger fac = BigInteger.ONE;

		for (int i = 1; i <= n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		return fac.mod(m);

	}
}
