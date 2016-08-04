package A_20160804;

import java.util.Scanner;

public class A_10991 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		for (int i = 0; i < N; i++) {

			for(int k=N-i-2 ; k>=0 ;k--){
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		input.close();
	}
}
