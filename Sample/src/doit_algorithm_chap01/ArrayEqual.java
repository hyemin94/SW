package doit_algorithm_chap01;

import java.util.Scanner;

//2-7(p.62)
public class ArrayEqual {

	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a 요솟수 : ");
		int na = sc.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		System.out.print("b 요솟수 : ");
		int nb = sc.nextInt();

		int[] b = new int[nb];

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}

		System.out.println("a와  b의  요솟수는 " + (equals(a, b) ? "같습니다." : "같지않습니다."));

	}

}
