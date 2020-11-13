package doit_algorithm_chap01;

import java.util.Scanner;

public class TriangleLU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 위가 n값 만큼 직각인 삼각형을 출력합니다.");
		int n;
		do {
			System.out.print("몇 단 입니까? ");
			n = sc.nextInt();
		} while (n <= 0);
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--)
				System.out.printf("*");
			System.out.println();
		}

	}

}
