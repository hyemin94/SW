package Doit_chap01and02;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("세정수의 최댓값은?");
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		System.out.println("c의 값 : ");
		int c = sc.nextInt();
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		System.out.println("최댓값은" + max + "입니다.");

	}

}