package A_20160629;
import java.util.Scanner;
public class A_11021_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int sum[] = new int[t];
		int a, b = 0;
		for (int i = 0; i < t; i++) {
			a = input.nextInt();
			b = input.nextInt();
			sum[i] = a + b;
		}
		for (int i = 0; i < t; i++) {
			System.out.println("Case #" + (i + 1) + ": " + sum[i]);
		}
		input.close();
	}
}
