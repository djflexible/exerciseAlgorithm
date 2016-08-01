package A_20160627;

import java.util.Scanner;

public class A_2847 {

	public static void main(String[] args) {

		System.out.println("2847번");
		Scanner input = new Scanner(System.in);

		int size = input.nextInt();
		int value[] = new int[size];
		// int max = 0;
		int count = 0;
		int sum = 0;

		for (int i = 0; i < size; i++) {
			value[i] = input.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.println("원본 : " + value[i]);
		}

		int max = value[size - 1];// k=1부터

		for (int i = 1; i < size; i++) {

			if (max < value[size - i - 1]) {
				count = value[size - i - 1] - max + 1;
				sum = sum + count;
				value[size - i - 1] = max - 1;
				
				System.out.println("count 값 : " + count);
				System.out.println("sum 값 : " + sum);
								
			}

			if (max == value[size - i - 1]) {
				count = 1;
				sum = sum + count;
				value[size - i - 1] = max - 1;
				max = value[size - i - 1];
				
				System.out.println("count 값 : " + count);
				System.out.println("sum 값 : " + sum);
			}

			if (max > value[size - i - 1]) {
				max = value[size - i - 1];
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.println("수정 : " + value[i]);
		}

		System.out.println(sum);
		
		input.close();

	}

}
