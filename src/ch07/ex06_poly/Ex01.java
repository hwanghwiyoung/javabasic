package ch07.ex06_poly;

class A {
	void a() {
		System.out.println("a()");
	}
}

class B extends A {
	void b () {
		System.out.println("b()");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		B b= new B();
		b.a();
		b.b();
		
		
	}

}
