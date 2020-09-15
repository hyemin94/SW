package Carex;

public class Avante extends Car {

	@Override
	public void start() {
		System.out.println("Avante 시동킵니다.");
	}

	@Override
	public void drive() {
		System.out.println("Avante 드라이브 중입니다.");

	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Avante을 멈춥니다.");

	}
}
