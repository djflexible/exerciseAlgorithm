package A_20160620;

import java.util.ArrayList;

public class A_1193_1 {

	public static void main(String[] args) {

		int MAX = 10;
		int arry[][] = new int[MAX][MAX];
		int num[] = new int[MAX];
		int sum = 0;
		int k = 0;

		for (int j = 2; j < MAX; j++) {// 홀수
			if ((j % 2) == 0) { // 짝수

				k = j / 2;
				num[j] = (2 * k * k) - k;
				// System.out.println(num[j]);
			}

			if ((j % 2) != 0) {
				k = j / 2;
				num[j] = (2 * k * k) - k + 1;
				// System.out.println(num[j]);

			}

		}

		ArrayList<Integer> num2 = new ArrayList();

		for (int i = 0; i < MAX; i++) {

			num2.add(num[i]);
		}
		num2.remove(1);
		num2.remove(0);

		System.out.println(num2);

		System.out.println("\n===");

		for (int i = 0; i < num2.size(); i++) {

			for (int j = 0; j < num2.size(); j++) {

				if ((j % 2) == 0) { // 짝수

					arry[i][j] = num2.get(j);
					System.out.print(arry[i][j] + "p, ");

		
				}

				if ((j % 2) != 0) { // 홀수
					
					int temp =0;
					
					arry[i][j] = num2.get(j);
					System.out.print(arry[i][j] + ", ");

					temp = num2.get(j)-1;
					arry[i][j] = temp;
				}
			}

			System.out.println();

		}

	}

	private static ArrayList<Integer> ArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

}
