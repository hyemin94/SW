package CodingEverday;

class Print {
	public String delimiter = "";

	// 생성자 : 초기의 작업을 수행할 때 사용
	// this : 클래스가 인스턴스화되었을때 인스턴스를 가르키는 특수한 이름
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}

	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}