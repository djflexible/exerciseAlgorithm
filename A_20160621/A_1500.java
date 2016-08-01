package A_20160621;

import java.util.Scanner;

public class A_1500 {

	public static void main(String[] args) {

		System.out.println("1500번");

		Scanner input = new Scanner(System.in);
		int s = input.nextInt();// 합
		int k = input.nextInt();// 개수

		long gop = 1;// 곱
		int min = 0;// 최소 수
		int mob = 0;// 나머지
		int arry[] = new int[k];

		min = s / k;
		mob = s % k;

		for (int i = 0; i < k; i++) {

			arry[i] = min;

			if (mob != 0) {
				for (int j = 0; j < mob; j++) {
					arry[j] = min + 1;

				}
				gop *= arry[i];

			}

			else {
				gop *= arry[i];
			}
		}

		for (int i = 0; i < k; i++) {
			System.out.print(arry[i] + ", ");
		}

		System.out.println();
		System.out.println("s : " + s);
		System.out.println("k : " + k);
		System.out.println("min : " + min);
		System.out.println("mob : " + mob);
		System.out.println("gop : " + gop);

	}

}
