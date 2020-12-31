package Doit_chap01and02;

public class Max4 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max4 = " + max4(10, 30, 50, 100));

	}

}
