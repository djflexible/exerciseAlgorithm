package A_20160621;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class A_2002 {

	public static void main(String[] args) {

		System.out.println("2002번");

		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // 자동차 수
		int num[] = new int[n];

		String car0[] = new String[n]; // 들어간 순서
		int count = 0;

		LinkedHashMap<String, Integer> car1 = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			car1.put(input.next(), i);
		}

		for (int i = 0; i < n; i++) {
			car0[i] = input.next();
		}

		for (int i = 0; i < n; i++) {
			num[i] = car1.get(car0[i]);

		}

		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + ", ");
		}

		for (int i = 0; i < n; i++) {//뒤에 작은 수가 하나라도 발견되면 count

			for (int j = i + 1; j < n; j++) {
				if (num[i] > num[j]) {
					count++;
					break;
				}
			}

		}

		System.out.print("\n" + count);
		input.close();
	}
}
