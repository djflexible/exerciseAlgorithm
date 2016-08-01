package A_20160629;
//실패
import java.math.BigDecimal;
import java.util.Scanner;

public class A_10827 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double k = 1;
		double a = input.nextDouble();
		int b = input.nextInt();

		BigDecimal a1 = new BigDecimal(Double.toString(a));
		BigDecimal k1 = new BigDecimal(Double.toString(k));

		for (int i = 0; i < b; i++) {
			k1 = k1.multiply(a1);
		}

		System.out.println(k1);
		input.close();
	}
}
