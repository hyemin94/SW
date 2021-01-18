package CodingEverday;

class Accounting {
	// class : 비슷한 변수들, 메소드들 을 이름을 붙인다.

	public static double valueOfSupply; // 공급가액
	public static double vatRate = 0.1; // 부가가치세율

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

}

public class AccountingApp {

	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0;
		System.out.println("Value of supply : " + Accounting.valueOfSupply);
		System.out.println("VAT : " + Accounting.getVAT());
		System.out.println("Total : " + Accounting.getTotal());
	}

}
