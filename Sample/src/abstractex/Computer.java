package abstractex;

public abstract class Computer {
	
	// 추상 메소드 : 상위 클래스용으로 사용
	// 하위클래스가 알아서 구현해서 사용
	public abstract void display();
	public abstract void typing();
	
	// 공통으로 쓰는 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
