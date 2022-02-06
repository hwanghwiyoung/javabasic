package ch07.ex05_modifier;

class User {
	private String name;
	private int age;
	
	// 생성자
	User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
		// getters, setters
		int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
}

public class Ex02 {

	public static void main(String[] args) {
		User user = new User("길동", 20);
		user.setAge(30);
		System.out.println(user.getAge());
		
		
	}

}
