package Doit_chap05;

import java.util.Scanner;

import Doit_chap04.IntStack;

// 재귀함수 이해하기
class Recur {
	// 재귀함수
	static void recur(int n) {
//		3) 전체 재귀 제거
		IntStack s = new IntStack(n);

		while (true) {
			if (n > 0) {
				s.push(n);
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}

//		2) 꼬리부분 재귀 제거
//		while (n > 0) {
//			recur(n - 1);
//			System.out.println(n);
//			n = n - 2;
//		}

//		1) 2개의 재귀 버전
//		if (n > 0) {
//			recur(n - 1);
//			System.out.println(n);
//			recur(n - 2);
//		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();

		recur(x);
	}

}
