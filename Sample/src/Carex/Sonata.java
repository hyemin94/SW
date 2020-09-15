package Carex;

public class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("sonata 시동킵니다.");
	}

	@Override
	public void drive() {
		System.out.println("sonata 드라이브 중입니다.");

	}

	@Override
	public void stop() {
		System.out.println("sonata 멈춥니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("sonata turn을 멈춥니다.");

	}

}
