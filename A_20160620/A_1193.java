package A_20160620;

public class A_1193 {

	public static void main(String[] args) {

		System.out.println("question : 1193");

		int MAX = 9;
		int arry[][] = new int[MAX][MAX];
		int num[] = new int[MAX];
		int sum = 0;
		int k = 0;

	

		System.out.println();

		for (int i = 0; i < MAX; i++) {

			for (int j = 0; j < MAX; j++) {// 홀수
				if ((j % 2) != 0) {
					k = j / 2;
					num[j] = (2 * k * k) - k+1;
					System.out.println((i+1) + ", " + (j-1) + " : " + num[j]);
					
					
				}

				if ((j % 2) == 0) { // 짝수

					k = j / 2;
					num[j] = (2 * k * k) - k;
					System.out.println((i+1) + ", " + (j-1) + " : " + num[j]);
				}
			}
			
			System.out.println("///////////////////////");

			
			
			
		}

		System.out.println(0 % 2);
		System.out.println(1 % 2);
		System.out.println(2 % 2);
		System.out.println(3 % 2);
		System.out.println(4 % 2);

	}
}
