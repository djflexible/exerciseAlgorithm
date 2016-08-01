package A_20160722;

import java.util.Scanner;

public class HE_Stack {

	public static void main(String[] args) {

		System.out.println("스택_!");

		Stack stack = new Stack();
		int loc = 0;
		int k = 0;//삽입 원소
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		int N = sc1.nextInt();
		String cmd[][] = new String[N][10];

		for (int j = 0; j < N; j++) {
			for (int i = 0; i < 10; i++) {
				cmd[j][i] = sc2.nextLine();
			}
		}

		for (int j = 0; j < N; j++) {
			for (int i = 0; i < 10; i++) {

				if (cmd[j][i].contains("P")) {
					loc = cmd[j][i].length();
					k = Integer.parseInt(cmd[j][i].substring(2, loc));
					stack.push(k);
				}

				if (cmd[j][i].contains("B")) {
					stack.pop();
				}

				if (cmd[j][i].contains("top")) {
					stack.peek();
				}

				if (cmd[j][i].contains("empty")) {
					stack.empty();
				}
			}
		}
		sc1.close();
		sc2.close();
	}

}
