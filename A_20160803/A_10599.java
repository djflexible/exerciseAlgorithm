package A_20160803;

import java.util.ArrayList;
import java.util.Scanner;

public class A_10599 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> max = new ArrayList<Integer>();
		ArrayList<Integer> min = new ArrayList<Integer>();

		while (true) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			int d = input.nextInt();

			if (a == 0 && b == 0 && c == 0 && d == 0) {
				break;
			}
			max.add(d - a);
			min.add(c - b);
		}

		for (int i = 0; i < min.size(); i++) {
			System.out.println(min.get(i) + " " + max.get(i));
		}
		input.close();
	}
}
