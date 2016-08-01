package A_20160722;

//https://www.hackerearth.com/problem/algorithm/find-product/
//원소의 곱을 구할 때, 큰 수를 처리할 때 사용하면 좋음 
import java.math.BigInteger;
import java.util.Scanner;

public class Find_Product {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger A[] = new BigInteger[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextBigInteger();
		}

		// int answer = 1;
		BigInteger answer = BigInteger.ONE;
		BigInteger k = BigInteger.valueOf(1000000007);

		for (int i = 0; i < N; i++) {
			answer = (answer.multiply(A[i])).mod(k);
		}
		System.out.println(answer);

		sc.close();
	}
}
