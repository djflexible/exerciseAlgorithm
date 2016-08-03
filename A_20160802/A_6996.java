package A_20160802;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class A_6996 {

	public static void main(String[] args) {

		System.out.println("A_6996 start");
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int result[] = new int[T];
		String str1Arry[] = new String[T];
		String str2Arry[] = new String[T];

		for (int i = 0; i < T; i++) {

			String str1 = input.next();
			String str2 = input.next();

			str1Arry[i] = str1;
			str2Arry[i] = str2;

			int count = 0;

			LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
			LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();

			for (char c : str1.toCharArray()) {

				if (map1.containsKey(c)) {
					map1.put(c, map1.get(c) + 1);
				} else {
					map1.put(c, 1);
				}
			}

			for (char c : str2.toCharArray()) {

				if (map2.containsKey(c)) {
					map2.put(c, map2.get(c) + 1);
				} else {
					map2.put(c, 1);
				}
			}

			for (char key : map1.keySet()) {
				for (char key1 : map2.keySet()) {
					if ((key == key1) && (map1.get(key) == map2.get(key))) {
						count++;
					}
				}
			}

			if (count == map1.size()) {
				result[i] = 1;
			} else {
				result[i] = 0;
			}
		}

		for (int i = 0; i < T; i++) {

			if (result[i] == 1) {

				System.out.println(str1Arry[i] + " & " + str2Arry[i]
						+ " are anagrams.");
			}

			if (result[i] == 0) {
				System.out.println(str1Arry[i] + " & " + str2Arry[i]
						+ " are NOT anagrams.");
			}
		}

		input.close();
	}

}
