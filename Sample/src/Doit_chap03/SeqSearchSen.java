package Doit_chap03;

import java.util.Scanner;

// 선형 검색(보초법)
class SeqSearchSen {

	// 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
	static int seqSearchSen(int[] a, int n, int key) {
		// x : 1,2,3,4, 공백
		// num : 4
		// ky : 5
		int i = 0;

		a[n] = key;

		// 배열 값이 같은지 확인
		while (true) {
			if (a[i] == key)
				break;
			i++;
		}
		// 마지막 값이면 -1, 마지막 전까지의 배열의 값이면 i 리턴
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();

		int idx = seqSearchSen(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");

	}

}
