package A_20160804;

import java.util.Scanner;

public class A_1081 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int L = input.nextInt();
		int U = input.nextInt();
		int sum = 0;
		StringBuffer sb = new StringBuffer();

		for (int i = L; i <= U; i++) {
			sb.append(i);
		}

		String str = sb.toString();
		String strArry[] = str.split("");
		int num[] = new int[strArry.length];

		for (int i = 0; i < strArry.length; i++) {
			num[i] = Integer.parseInt(strArry[i]);
			sum = sum + num[i];
		}
		System.out.println(sum);
		System.out.println("다이내믹 프로그래밍으로 풀지 않음");

		
		input.close();
	}

}
