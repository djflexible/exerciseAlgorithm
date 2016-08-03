package A_20160802;
import java.util.Scanner;

public class ThreeSixNine_game {
	public static void main(String[] args) {
		System.out.println("3, 6, 9 게임 시작");
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int num[] = new int[N];
		String fnum[] = new String[N];

		for (int i = 0; i < N; i++) {
			num[i] = i + 1;
			fnum[i] = Integer.toString(num[i]);

			if (fnum[i].contains("3") || fnum[i].contains("6")
					|| fnum[i].contains("9")) {
				fnum[i] = "*";
			}
			System.out.println(fnum[i]);
		}
		input.close();
	}
}