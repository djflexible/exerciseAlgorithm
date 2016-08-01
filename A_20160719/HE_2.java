package A_20160719;

import java.math.BigInteger;
import java.util.Scanner;

//https://www.hackerearth.com/problem/algorithm/big-values/ 
// C(n,r) = n!/(r! * (n-r)!) 
// C(N,6) mod 10^9 + 7
public class HE_2 {

	public static void main(String[] args) {

		BigInteger k = new BigInteger("1000000007");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		HE_2 test = new HE_2();
		// test.fac(N);
		System.out.println(test.fac(N).mod(k));

		input.close();

	}

	public static BigInteger fac(int n) {
		// C(n,r) = n!/(r! * (n-r)! ,r=6
		BigInteger facVal1 = BigInteger.ONE;
		BigInteger facVal2 = BigInteger.ONE;
		BigInteger R = new BigInteger("720");
		BigInteger result = BigInteger.ONE;

		for (int i = 1; i <= n - 6; i++) { // (n-r)!
			facVal2 = facVal2.multiply(BigInteger.valueOf(i));
		}

		for (int i = n - 5; i <= n; i++) { // n!
			facVal1 = facVal1.multiply(BigInteger.valueOf(i));
		}
		facVal1 = facVal1.multiply(facVal2);

		/*
		 for (int i = 1; i <= n; i++) { // n! 
			 facVal1 =facVal1.multiply(BigInteger.valueOf(i)); }
		 */

		result = R.multiply(facVal2);
		return facVal1.divide(result);
	}

}
