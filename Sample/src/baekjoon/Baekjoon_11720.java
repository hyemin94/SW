package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_11720 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);

		int[] sum = new int[N];
		for (int i = 0; i < sum.length; i++) {
			sum[N] = sc.nextInt();
			sc.close();
		}
	}
}
