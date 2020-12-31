package Doit_chap01and02;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~n까지의 합을 구합니다.");
		System.out.printf("n값 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		int x = 1;
		while (x <= n) {
			sum += x;
			x++;
		}
		System.out.println("1부터 n까지의 합 : " + sum);
	}

}
