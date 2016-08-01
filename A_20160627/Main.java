package A_20160627;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int size = input.nextInt();
		int value[] = new int[size];
		int count = 0;
		int sum = 0;

		for (int i = 0; i < size; i++) {
			value[i] = input.nextInt();
		}
		int max = value[size - 1];

		for (int i = 1; i < size; i++) {
			if (max < value[size - i - 1]) {
				count = value[size - i - 1] - max + 1;
				sum = sum + count;
				value[size - i - 1] = max - 1;
			}
			if (max == value[size - i - 1]) {
				count = 1;
				sum = sum + count;
				value[size - i - 1] = max - 1;
				max = value[size - i - 1];
			}
			if (max > value[size - i - 1]) {
				max = value[size - i - 1];
			}
		}
		System.out.println(sum);
		input.close();
	}
}
