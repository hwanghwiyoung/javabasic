package ch07.ex03_super;

public class Worker extends Person {

	// field
		String company = "";

		public void work() {
			System.out.println("work");
	}
		//constructor
		public Worker(String name, String company) {
			super(name);	// �θ�Ŭ������ �������� Person(name) �� ȣ���� �Ͱ� ����.
			this.company = company;
			System.out.println("Worker()");
		}
		
		
}
