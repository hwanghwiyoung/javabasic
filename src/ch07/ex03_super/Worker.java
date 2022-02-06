package ch07.ex03_super;

public class Worker extends Person {

	// field
		String company = "";

		public void work() {
			System.out.println("work");
	}
		//constructor
		public Worker(String name, String company) {
			super(name);	// 부모클래스의 생성자인 Person(name) 을 호출한 것과 같다.
			this.company = company;
			System.out.println("Worker()");
		}
		
		
}
