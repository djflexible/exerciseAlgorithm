package A_20160704;

import java.util.Scanner;

public class A_11052 {

	public static void main(String[] args) {

		System.out.println("11052번 모름");
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		double cost[] = new double[n];
		double avgCost[] = new double[n];
		double avgMax = 0;
		double sum = 0;
		int k = 0; // 위치 기억
		int m = 0;

		for (int i = 0; i < n; i++) {
			cost[i] = input.nextInt();
			avgCost[i] = cost[i] / (i + 1);
			System.out.println(avgCost[i]);
		}

		do {
			for (int i = 0; i < n; i++) {
				if (avgMax < avgCost[i]) {
					avgMax = avgCost[i];
					k = i;
					// sum = cost[k];
				}

				sum = cost[k];
				System.out.println("sum값 : " + sum);
			}
			sum += sum;
			m += m + k;
			System.out.println("m값 : " + m);
			n = n - (m + 1);
			System.out.println("n값 : " + n);

		} while (n - (m + 1) == 0);

		System.out.println("avgMax : " + avgMax);
		System.out.println("sum : " + sum);
		System.out.println("k : " + k);
		System.out.println("m : " + m);

		input.close();
	}

}
