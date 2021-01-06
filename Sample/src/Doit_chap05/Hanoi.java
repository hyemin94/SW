package Doit_chap05;

import java.util.Scanner;

// p.180 재귀알고리즘(하노이탑)
public class Hanoi {

	static void move(int n, int x, int y) {

		if (n > 1)
			// (1)
			// 3, 1, 3 -> 2, 1, 2
			// 			  2, 1, 2 -> 1, 1, 3	=> 출력 1
			// 			  2, 1, 2	=> 출력 2
			
			// (2)
			// 			  2, 2, 3 -> 1, 2, 1 => 출력 5
			
			move(n - 1, x, 6 - x - y);
		System.out.println("원반[" + n + "]을" + x + "의 기둥에서" + y + "기둥으로 옮긴다.");

			// (1)
			// 			  2, 1, 2 -> 1, 3, 2	=> 출력 3

			// (2)
			// 3, 1, 3	=> 출력 4 
			// 3, 1, 3 -> 2, 2, 3	=> 출력 6
			// 			  2, 2, 3 -> 1, 1, 3 => 출력 7
		if (n > 1)
			move(n - 1, 6 - x - y, y);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("하노이의탑");
		System.out.print("원반의 개수 : ");
		int n = sc.nextInt();

		// 1번 기둥의 n개의 원반을 3번 기둥으로 옮긴다.
		move(n, 1, 3);

	}

}
