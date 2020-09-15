package Carex;

public class Grandeur extends Car {

	@Override
	public void start() {
		System.out.println("Grandeur 시동킵니다.");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur 드라이브 중입니다.");

	}

	@Override
	public void stop() {
		System.out.println("Grandeur 멈춥니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Grandeur을 멈춥니다.");

	}

}
