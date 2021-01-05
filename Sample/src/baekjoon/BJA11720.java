package baekjoon;

import java.util.Scanner;

// 문자열
public class BJA11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num_1 = sc.nextInt();

		if (1 <= num_1 && num_1 <= 100) {
			String num_2 = sc.next();

			if (num_1 == num_2.length()) {
				int sum = 0;
				for (int i = 0; i < num_2.length(); i++) {
					// 숫자 0 : 아스키코드 값 48
					sum += (num_2.charAt(i) - '0');
				}
				System.out.println(sum);
			}
		}
	}
}