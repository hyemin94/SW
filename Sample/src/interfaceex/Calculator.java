package interfaceex;

public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	/*  구현 x
	 *  int times(int num1, int num2);
		int divide(int num1, int num2); */

}
