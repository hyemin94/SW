package Doit_chap06;

import java.util.Scanner;

class ShellSort {

	static void ShellSort(int[] a, int n) {
		for (int h = n / 2; h > 0; h /= 2)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
					a[j + h] = a[j];
				a[j + h] = tmp;
			}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("셸정렬(버전 1)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}

		ShellSort(x, nx);
		System.out.println("셸정렬 후");
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}

	}
}
