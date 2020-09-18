package sort;

public class RecursionTest {
	public static void main(String[] args) {
		Function(5);
	}
	
	public static void Function(int num) {
		if(num == 0) {
			return;
		}
		else{			
			System.out.println("hello");
			Function(num-1);
		}
	}

}
