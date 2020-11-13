package doit_algorithm;

public class Max3m {

	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;
	}

	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
		System.out.println("max3(5,2,10) = " + max3(5, 2, 10));
		System.out.println("max3(100,200,800) = " + max3(100, 200, 800));
	}

}
