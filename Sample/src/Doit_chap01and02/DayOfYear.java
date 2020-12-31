package Doit_chap01and02;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

	// 서기 year년은 윤년인가?(윤년 : 1/ 평년 : 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 1000 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {
		int days = d;

		for (int i = 1; i < m; i++)
			days += mdays[isLeap(y)][i - 1];
		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;

		System.out.println("그 해 경과일수를 구합니다.");

		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int monteh = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();

			System.out.printf("그 해 %d 일째입니다.\n", dayOfYear(year, monteh, day));

			System.out.print("한번 더 할까요? (yes : 1 / no : 0) : ");
			retry = sc.nextInt();
		} while (retry == 1);
	}

}