package Doit_chap01and02;

import java.util.Scanner;

// 2-6(p.60)
public class ReverseArray {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - i - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int [] x = new int [num];
		
		for (int i=0; i < num; i++) {			
			System.out.println("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		reverse(x);

		System.out.println("요소를 역순으로 정렬합니다.");
		for (int i=0; i < num; i++) {
			System.out.println(x[i]);
		}
		
	}
		
		
}
