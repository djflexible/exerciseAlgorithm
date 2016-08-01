package A_20160621;

import java.util.Scanner;

public class A_1110 {

	public static void main(String[] args) {
		System.out.println("1110번");

		int left = 0;// 10자리
		int right = 0;// 1자리
		int newNum = 0;
		int var = 0;
		int count = 0;
		int num1 = 0;// 초기값

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();// 입력값
		num1 = num;

		while (num1 != newNum) { // 괄호가 거짓일때 나옴

			left = num / 10;
			right = num % 10;
			var = left + right;
			newNum = 10 * right + (var % 10);
			count++;
			num = newNum;

		}

		// System.out.println("num1 : " + num1);
		System.out.println("num : " + num);
		System.out.println("left : " + left);
		System.out.println("right : " + right);
		System.out.println("var : " + var);
		System.out.println("var% : " + var % 10);
		System.out.println("newNum : " + newNum);
		System.out.println("count : " + count);
	}

}
