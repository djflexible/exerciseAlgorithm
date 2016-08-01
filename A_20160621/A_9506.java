package A_20160621;

import java.util.ArrayList;
import java.util.Scanner;

public class A_9506 {

	public static void main(String[] args) {

		System.out.println("9506번");

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> yak = new ArrayList<Integer>();
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		int sum = 0;
		int num = 0;
		int count = 0;

		while ((num = input.nextInt()) != -1) {
			num1.add(num);
			count++;
		}

		for (int j = 0; j < count; j++) {

			for (int i = 1; i < num1.get(j); i++) {// 약수 구하기
				if (num1.get(j) % i == 0) {
					yak.add(i);
				} else {

				}

			}

			for (int i = 0; i < yak.size(); i++) { // 약수 합 구하기
				sum = sum + yak.get(i);
				System.out.print(yak.get(i) + ", ");

			}

			System.out.println();
			System.out.println("size : " + yak.size());
			System.out.println("sum : " + sum);

			//
		}
	}

}
