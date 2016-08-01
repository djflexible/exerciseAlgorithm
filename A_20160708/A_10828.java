package A_20160708;

import java.util.Scanner;

public class A_10828 {

	public static void main(String[] args) {

		System.out.println("스택_!");

		Stack stack = new Stack();
		int loc = 0;
		int k = 0;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		int N = sc1.nextInt();
		String cmd[] = new String[N];

		for (int i = 0; i < N; i++) {
			cmd[i] = sc2.nextLine();
		}

		for (int i = 0; i < N; i++) {

			if (cmd[i].contains("push")) {
				loc = cmd[i].length();
				k = Integer.parseInt(cmd[i].substring(5, loc));
				stack.push(k);
			}

			if (cmd[i].contains("pop")) {
				stack.pop();
			}

			if (cmd[i].contains("top")) {
				stack.peek();
			}

			if (cmd[i].contains("size")) {
				stack.size();
			}

			if (cmd[i].contains("empty")) {
				stack.empty();
			}
		}
		sc1.close();
		sc2.close();
	}

}
