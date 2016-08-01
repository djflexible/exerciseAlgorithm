package A_20160616;

import java.util.Scanner;

public class A_1015 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int size = 0;
		int arry[] = new int[50];
		int arry2[] = new int[50];

		System.out.print("배열 사이즈 입력 : ");
		size = input.nextInt();

		for (int i = 0; i < size; i++) {

			System.out.print("원소 입력 : ");
			arry[i] = input.nextInt();

		}

		for (int i = 0; i < size; i++) {

			System.out.print(arry[i] + ", ");

		}

		for (int i = 0; i < size; i++) {

			arry2[i] = arry[(int) (Math.random() * (size))];
			for (int j = 0; j < i; j++) {

				if (arry2[i] == arry2[j]) { // 중복검사
					i--;
					// break;
				}

			}

		}

		System.out.println("//");

		for (int i = 0; i < size; i++) {

			System.out.print(arry2[i] + ", ");

		}

	}

}
