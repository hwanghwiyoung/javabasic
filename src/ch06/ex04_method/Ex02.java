package ch06.ex04_method;

class Check{
	static int cv = 5;					// 클래스 변수
	int iv = 4; 						// 인스턴스 변수
	
	static void cm() {					// 클래스 메서드
		System.out.println("class method.");
	}
	void im() {							// 인스턴스 메서드
		System.out.println("instance method.");
	}
	
	static void classMethod() {			
		// 클래스 메서드에서 인스턴스 멤버에 접근
		//System.out.println(iv);		// 에러발생!!!
		//im();							// 에러발생!!!
		
		// 클래스 메서드에서 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	void instanceMethod() {				
		// 인스턴스 메서드에서 클래스 멤버에 접근
		System.out.println(cv);
		cm();
		
		// 인스턴스 메서드에서 인스턴스 멤버에 접근
		System.out.println(iv);
		im();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Check.classMethod();			// 성공
		//Check.instanceMethod();		// 에러발생 !!!(교재 오류 확인)
		
		Check check = new Check();
		check.classMethod();			// 성공
		check.instanceMethod();			// 성공
	}
}