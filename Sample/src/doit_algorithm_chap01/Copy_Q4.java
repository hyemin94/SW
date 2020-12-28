package doit_algorithm_chap01;

import java.util.Scanner;

public class Copy_Q4 {

	static void copy(int[] a, int[] b) {
//		b = a;

		for (int i = 0; i < a.length; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = a[i];
			System.out.println(b[i]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열 a의 요솟수 입력 : ");
		int x = sc.nextInt();
		int[] a = new int[x];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		int[] b = new int[x];

		copy(a, b);
		// System.out.println(copy(a, b));

	}

}
