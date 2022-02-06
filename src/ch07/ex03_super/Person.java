package ch07.ex03_super;

public class Person {
	
		// field
		String name;

		// method
		public void eat() {
			System.out.println("eat");
		}
		public void sleep() {
			System.out.println("sleep");
			
	}
		
		Person(String name) {
			this.name = name;
			System.out.println("Person()");
		}
		
		

}
