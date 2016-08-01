package A_20160627;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class A_2953 {

	public static void main(String[] args) {

		System.out.println("2953번");

		int size = 5;// 사람 수
		int score[] = new int[4];// 점수
		int sumArry[] = new int[5];// 합 저장
		int max = 0;

		Scanner input = new Scanner(System.in);

		LinkedHashMap<Integer, Integer> Map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < size; i++) {
			int sum = 0;
			for (int j = 0; j < score.length; j++) {
				score[j] = input.nextInt();
				sum = sum + score[j];
			}

			Map.put(sum, i);
			sumArry[i] = sum;
		}

		for (int i = 0; i < sumArry.length; i++) {
			if (sumArry[i] > max)
				max = sumArry[i];
		}

		System.out.println(Map.get(max)+1 + " " + max);

		input.close();

	}
}
