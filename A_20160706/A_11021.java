package A_20160629;
import java.util.Scanner;
public class A_11021 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int a[] = new int[t];
		int b[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = input.nextInt();
			b[i] = input.nextInt();
		}
		for (int i = 0; i < t; i++) {
			System.out.println("Case #" + (i + 1) + ": " + (a[i] + b[i]));
		}
		input.close();
	}
}
