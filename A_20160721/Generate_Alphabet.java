package A_20160721;

import java.util.Scanner;

public class Generate_Alphabet {

	public static void main(String[] args) {

		System.out.println("알파벳 발생기 덜품");
		Scanner input = new Scanner(System.in);

		String str1 = input.next();
		String[][] str3 = new String[2][100]; // 피보나찌 결과 수
		// ArrayList<String> str4 = new ArrayList<String>();

		int k = 0; // 위치 기억

		String[] str2 = str1.split(""); // 자른 문자열을 배열에 저장
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i] + ", ");
		}

		// 2묶음씩 1개 일때

		for (int j = 1; j <= 2; j++) {
			for (int i = 0; i < str2.length; i++) {

			}
		}

		input.close();
	}
}
