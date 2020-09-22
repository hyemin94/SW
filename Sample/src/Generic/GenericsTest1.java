package Generic;

class Box<T>{
	T vol;
	void setVolume(T v) {
		vol = v;
	}
	T getVolume() {
		return vol;
	}
}


public class GenericsTest1 {
	public static void main(String[] args) {
		Box<Integer> ibox = new Box<Integer>();
		ibox.setVolume(200);
		System.out.println("ibox : "+ ibox.getVolume());
		Box<Double> dbox = new Box<Double>();
		dbox.setVolume(123.456);
		System.out.println("dbox : "+ dbox.getVolume());
	}

}
