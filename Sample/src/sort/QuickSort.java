package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int data[] = { 66, 10, 1, 34, 5, -10 };

		QuickSort quick = new QuickSort();
		quick.sort(data, 0, data.length - 1);

		System.out.println();
		System.out.println(Arrays.toString(data));
	}

	public void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;

			if (left <= right) {
				System.out.println("change");
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
			System.out.println(Arrays.toString(data) + " " + pivot);
			System.out.println("left : " + left + " right : " + right);
		} while (left <= right);

		if (l < right) {
			System.out.println("l : " + " end : " + right);
			sort(data, l, right);
		}
		if (r > left) {
			System.out.println("l : " + left +  "end : " + r);
			sort(data, left, r);
		}
	}
}
