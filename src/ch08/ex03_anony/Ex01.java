package ch08.ex03_anony;

interface Age {
	int age = 29;
	void getAge();
	
}

class MyClass implements Age {
	@Override
	public void getAge() {
		System.out.println("Age is  " + age + ".");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 일반적인 클래스 사용시
		MyClass obj = new MyClass();
		obj.getAge();
		
		// 익명 클래스 사용시
		Age obj1 = new Age() {
			public void getAge() {
				System.out.println("Age is "+ age);
			}
		};
		obj1.getAge();
	}

}
