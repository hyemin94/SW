package sort;

import java.util.Arrays;

public class MergeSort {
	static int[] sorted = new int[6];

	public static void merge(int a[], int m, int middle, int n) {
		int start = m; // 첫번째 부분집합의 시작 위치 설정
		int secondstart = middle + 1; // 두번째 부분집합의 시작 위치 설정
		int save = m; // 배열 sorted에 정렬된 원소를 저장할 위치 설정

		while (start <= middle && secondstart <= n) { // 나눈 부분의 마지막 까지 가는동안
			if (a[start] < a[secondstart]) { // 정렬
				sorted[save] = a[start];
				start++;
			} else { // 정렬
				sorted[save] = a[secondstart];
				secondstart++;
			}
			save++; // 저장 위치 설정
		}
		if (start > middle) { // 중간 이상이면
			for (int t = secondstart; t <= n; t++, save++) { // j부터 n 까지
				sorted[save] = a[t];
			}
		} else { // 앞부분이면
			for (int t = start; t <= middle; t++, save++) { // 시작부터 middle까지
				sorted[save] = a[t];
			}
		}
		for (int t = m; t <= n; t++) { // 정렬된 배열을 저장
			a[t] = sorted[t];
		}
		System.out.println("정렬된 배열 : " + Arrays.toString(a));
	}

	// mergeSort를 다시 호출하여 정렬
	public static void mergeSort(int a[], int m, int n) {
		int middle;
		if (m < n) { // 시작, 끝위치
			middle = (m + n) / 2; // 중간을 middle로 둔다.
			mergeSort(a, m, middle); // 앞에거
			mergeSort(a, middle + 1, n);// 뒤에거
			merge(a, m, middle, n);// 정렬
		}
	}

	public static void main(String[] args) {
		int[] list = { 1, 3, 4, 9, 7, 6 }; // 정렬할 배열
		int size = list.length; // 배열의 사이즈

		System.out.println("정렬할 배열 : " + Arrays.toString(list));
		mergeSort(list, 0, size - 1); // mergeSort(int a[], int m, int n)
		// 정렬할 배열, 시작위치, 끝위치
	}// end main
}
