package Carex;

public abstract class Car {

	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void wash() {
		System.out.println("세차를 합니당!");
	}
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		wash();
	}
}
