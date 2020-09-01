package sort;

/*
 * 작성일자 : 2020.09.01
 * 삼성소프트웨어역량테스트 (chapter01/02)
 */

public class InsertionSort {
	public static void main(String[] args) {

		int array[] = { 35, 9, 8, 18, 98, 31, 58, 17, 76, 45 };
		int size = array.length;

		System.out.println("==== 정렬 전 ====");
		for (int i = 0; i < size; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		insertSort(array, size);
	}

	public static void insertSort(int[] array, int size) {
		int i, j, k, key;
		
		for (i = 1; i < size; i++) {
			key = array[i];
			for ( j = i-1; j>=0 && array[j] > key; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = key;
		}

		System.out.println("==== 정렬 후 ====");
		for (k = 0; k < size; k++) {
			System.out.printf("%d ", array[k]);
		}
	}

}
