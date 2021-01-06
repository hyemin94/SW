package baekjoon;

import java.util.Scanner;

// 하노이탑
public class BJA11729 {
	static void hanoi(int n, int x, int y) {
		if (1 < n && n <= 20)
			hanoi(n - 1, x, 6 - x - y);

		System.out.println(x + " " + y);

		if (1 < n && n <= 20)
			hanoi(n - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		hanoi(num, 1, 3);

	}

}
