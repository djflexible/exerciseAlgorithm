package A_20160704;

import java.util.Scanner;

public class A_1267 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cnt = input.nextInt();
		int amt[] = new int[cnt];
		double youngSum[] = new double[cnt];
		double minSum[] = new double[cnt];
		double sum1 = 0;
		double sum2 = 0;

		A_1267 Dong = new A_1267();
		for (int i = 0; i < cnt; i++) {
			amt[i] = input.nextInt();
			youngSum[i] = Dong.youngFare(amt[i]);
			minSum[i] = Dong.minFare(amt[i]);
			sum1 = sum1 + youngSum[i];
			sum2 = sum2 + minSum[i];
		}
		String numFund = String.format("%.0f", sum1);
		String numFund2 = String.format("%.0f", sum2);
		if (sum1 < sum2) {
			System.out.println("Y " + numFund);
		}

		if (sum1 > sum2) {
			System.out.println("M " + numFund2);
		}
		if (sum1 == sum2) {
			System.out.println("Y M " + numFund);
		}
		input.close();
	}

	public double youngFare(int a) {

		double yFund = 0;
		if (a % 30 == 0) {
			yFund = (a / 30) * 10;
		}

		if ((a % 30 == 0) && ((a / 30 == 1))) {
			yFund = ((a / 30) + 1) * 10;
		}

		if (a % 30 != 0) {
			yFund = ((a / 30) + 1) * 10;
		}
		return yFund;
	}

	public double minFare(int b) {
		double mFund = 0;
		if (b % 60 == 0) {
			mFund = (b / 60) * 15;
		}
		if ((b % 60 == 0) && (b / 60 == 1)) {
			mFund = ((b / 60) + 1) * 15;
		}

		if (b % 60 != 0) {
			mFund = ((b / 60) + 1) * 15;
		}
		return mFund;
	}
}
