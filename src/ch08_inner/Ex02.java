package ch08_inner;

class Outer {
	int a = 3;
	static int b = 4;
	
	class InsInner {
		int c = 5;
		public void a() {
			System.out.println("InsInner a()");
			
		}
	}
	
	static class StaticInner {
		int d = 6;
		static int e = 7;
		
		public void a() {
			System.out.println("StaticInner a()");
		}
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// Outer class 접근하기
		System.out.println("-Oterclass-");
		Outer oc = new Outer();
		System.out.println(oc.a);
		System.out.println(oc.b);
		System.out.println(Outer.b);
		
		//Inner class 접근하기
		System.out.println("-Innerclass-");
		Outer oc2 = new Outer();
		Outer.InsInner i =oc2.new InsInner();
		System.out.println(i.c);
		i.a();
		
		//Static Inner class 접근하기 
		System.out.println("-Static Inner class-"); 
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println(si.d);
		System.out.println(si.e);
		System.out.println(Outer.StaticInner.e);
		si.a();
		 
		
				

	}

}
