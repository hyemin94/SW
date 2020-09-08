package sort;

/*
 * 작성일자 : 2020.08.31
 * 삼성소프트웨어역량테스트 (chapter01/01)
 */
public class SelectionSort {
	public static void main(String[] args) {
		int data[] = { 41, 31, 48, 97, 9, 65, 27, 29, 13, 15 };
		int size = data.length;
		int min;
		int temp = 0;

		for (int i = 0; i < data.length; i++) {
			System.out.println("data[" + i + "] : " + data[i]);
		}
		System.out.println();

		for (int i = 0; i < size - 1; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (data[min] > data[j]) {
					min = j;
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
			System.out.println("data[" + i + "] : " + temp);

		}
	}
}
