package ch08.ex02_interface;

interface Pokemon {
	String name = "pockemon";	// public static final 생략가능
	
	void attack();		// public abstract 생각가능
	void sound();
	
	// 인터페이스는 추상메소드만 정의 할 수 있다. 
//	public String getName() {
//		return this.name;
//	}
}

class Pikachu implements Pokemon {
	
	@Override
	public void attack() {// 구체적으로 구현
		System.out.println("전기 공격");
	}
	
	@Override
	public void sound() {
		System.out.println("전기공격");
	}
}

class Squirtle implements Pokemon {
	@Override
	public void attack() {
		System.out.println("물 공격");
	}
	
	@Override
	public void sound() {
		System.out.println("꼬복 꼬북");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Pikachu p = new Pikachu();
		p.attack();
		p.sound();
		
		
		Squirtle s = new Squirtle();
		s.attack();
		s.sound();
				
	}

}