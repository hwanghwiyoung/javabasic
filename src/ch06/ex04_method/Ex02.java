package ch06.ex04_method;

class Check{
	static int cv = 5;					// Ŭ���� ����
	int iv = 4; 						// �ν��Ͻ� ����
	
	static void cm() {					// Ŭ���� �޼���
		System.out.println("class method.");
	}
	void im() {							// �ν��Ͻ� �޼���
		System.out.println("instance method.");
	}
	
	static void classMethod() {			
		// Ŭ���� �޼��忡�� �ν��Ͻ� ����� ����
		//System.out.println(iv);		// �����߻�!!!
		//im();							// �����߻�!!!
		
		// Ŭ���� �޼��忡�� Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	void instanceMethod() {				
		// �ν��Ͻ� �޼��忡�� Ŭ���� ����� ����
		System.out.println(cv);
		cm();
		
		// �ν��Ͻ� �޼��忡�� �ν��Ͻ� ����� ����
		System.out.println(iv);
		im();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Check.classMethod();			// ����
		//Check.instanceMethod();		// �����߻� !!!(���� ���� Ȯ��)
		
		Check check = new Check();
		check.classMethod();			// ����
		check.instanceMethod();			// ����
	}
}