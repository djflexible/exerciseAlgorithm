package A_20160722;

import java.util.Scanner;

public class Semi_test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arryN[] = new int[N];

		for (int i = 0; i < N; i++) {
			arryN[i] = sc.nextInt();
		}

		int arryT1[] = new int[arryN[0]];
		String arryT11[] = new String[arryN[0]];
		int arryT2[] = new int[arryN[1]];
		String arryT22[] = new String[arryN[1]];

		for (int i = 0; i < arryT1.length; i++) {
			arryT1[i] = i + 1;

			if ((arryT1[i] % 3) == 0) {
				arryT1[i] = 0;
			}
			
			  if((arryT1[i]%5) ==0){ arryT1[i] = 0; }
			 
		}

		for (int i = 0; i < arryT11.length; i++) {
			arryT11[i] = Integer.toString(arryT1[i]);
			if ((arryT11[i] == "0")) {
				arryT11[i] = "Fizz";
			}

			if (arryT11[i] == "0") {
				arryT11[i] = "Buzz";
			}

		}

		System.out.println();

		for (int i = 0; i < arryT2.length; i++) {
			arryT2[i] = i + 1;
			if ((arryT2[i] % 3) == 0) {
				arryT2[i] = 0;
			}

			if ((arryT2[i] % 5) == 0) {
				arryT2[i] = 0;
			}
		}

		for (int i = 0; i < arryT22.length; i++) {
			arryT22[i] = Integer.toString(arryT2[i]);
			if ((arryT22[i] == "0")) {
				arryT22[i] = "Fizz";
			}

			if (arryT22[i] == "0") {
				arryT22[i] = "Buzz";
			}
			System.out.println(arryT22[i]);
		}

		for (int i = 0; i < arryT11.length; i++) {
			System.out.println(arryT11[i]);
		}

		for (int i = 0; i < arryT22.length; i++) {
			System.out.println(arryT22[i]);
		}

		arryT22[14] = "Buzz";

		sc.close();

	}
}
