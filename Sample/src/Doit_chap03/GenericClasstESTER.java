package Doit_chap03;

class GenericClasstESTER {

	static class GenericClass<T> {
		private T xyz;

		public GenericClass(T t) {
			this.xyz = t;
		}

		T getXyz() {
			return xyz;
		}
	}

	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		GenericClass<Boolean> b = new GenericClass<Boolean>(true);

		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
		System.out.println(b.getXyz());
	}

}
 