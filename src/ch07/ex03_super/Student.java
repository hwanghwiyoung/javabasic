package ch07.ex03_super;

public class Student extends Person {
	
	
	String company = "";
		// field
		String school;
		
		public void study() {
			System.out.println("study");
	}
		
		Student(String name, String school) {
			super(name);
			this.school = school;
			System.out.println("Student()");
		}

}
