package CodingEverday;

class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() {
		System.out.println(classVar);	// ok
//		System.out.println(instanceVar);	// error
	}

	public static void instanceMethod() {
		System.out.println(Foo.classVar);	// ok
//		System.out.println(Foo.instanceVar);	// error
	}
	
	

}

public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Foo.classVar);
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1";
		System.out.println(f1.classVar);

	}

}
