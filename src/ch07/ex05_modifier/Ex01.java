package ch07.ex05_modifier;

public class Ex01 {
	// 접근 제어자의 역할
	// 외부에서 접근할 수 있는 정도와 범위를 정해준다.
	
	public int data1 = 10;		// 접근 제한이 없음
	protected int data2 = 10;	// 같은 패키지 내에서와 자손 클래스에서 접근 가능
	int data3 = 10;				// 같은 패키지 내에서만 접근 가능
	private int data4 = 10;		// 같은 클래스 내에서만 접근 가능
	
	void testPrivate() {
		System.out.println(data4);
	}
}

class Access {
	void test() {
		Ex01 am = new Ex01();
		
		// private 제어자는 같은 클래스내에서만 접근 가능
		//System.out.println(am.data4);	
		
		
		// public 제어자를 사용하여 다른 package의 클래스 멤버에 접근하기
		//ch07.ex03_super.Student s= new ch07.ex03_super.Student("홍길동", "sbs");
		//System.out.println(s.school);
		
	}
}
