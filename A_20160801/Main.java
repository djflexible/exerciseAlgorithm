package A_20160801;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int number = scanner.nextInt();
			int sqrtNumber = (int) Math.sqrt(number);

			int minCount = Integer.MAX_VALUE;
			for (int index = sqrtNumber; index > 0; index--) {
				int subCount = compute(number, index);
				if (subCount < minCount)
					minCount = subCount;
			}
			System.out.println(minCount);
		} finally {
			scanner.close();
		}
	}

	public static int compute(int orignalNumber, int sqrtNumber) {
		if (sqrtNumber == 0 || orignalNumber == 0)
			return 0;

		int number = orignalNumber;
		int count = 0;
		int i = sqrtNumber;
		while (true) {
			int powerNumber = i * i;
			if (number >= powerNumber && (number - powerNumber) >= 0) {
				number -= powerNumber;
				count++;

				int minCount = Integer.MAX_VALUE;
				for (int index = i; index > 0; index--) {
					int subCount = compute(number, index);
					if (subCount < minCount)
						minCount = subCount;
				}
				count += minCount;
				break;
			} else {
				i--;
			}
		}

		return count;
	}

}