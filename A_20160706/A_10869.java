package A_20160629;

import java.util.Scanner;

public class A_10869 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		input.close();

	}

}