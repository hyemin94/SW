package doit_algorithm_chap01;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("정수입력 : ");
		int n = sc.nextInt();

		if (n > 0)
			System.out.println("이 수는 정수입니다.");
		else if (n < 0)
			System.out.println("이 수는 음수입니다.");
		else
			System.out.println("이 수는 0입니다.");
	}

}
