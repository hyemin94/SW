package Doit_chap01and02;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.printf("n : ");
		int n = sc.nextInt();
		int sum = 0;
		int x;
		if (n < 0) {
			System.out.println("n:0");
		} else {
			for (x = 0; x <= n; x++) {
				sum += x;
			}
			System.out.println("1~n : " + sum);
		}

	}

}
