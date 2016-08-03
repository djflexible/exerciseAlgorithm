package A_20160803;

import java.util.Scanner;

public class A_5554 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int sum = a+b+c+d;
		
		System.out.println(sum/60);
		System.out.println(sum%60);
		
		input.close();
		
		
	}

}
