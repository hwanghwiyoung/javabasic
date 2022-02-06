package ch08.ex01_abstract;

abstract class Pokemon {
	String name;
	
	abstract void attack();
	abstract void sound();
	
	public String getName() {
		return this.name;
	}
}
class Pikachu extends Pokemon {
	
	//생성자
	Pikachu() {
		this.name = "피카츄";
	}
	@Override
	void attack() {
		System.out.println("전기 공격");
	}
	@Override
	void sound() {
		System.out.println("피카 피카");
	}
}

class Squirtle extends Pokemon {
	
	//생성자
	Squirtle() {
		this.name = "꼬부기";
	}
	
	
	@Override
	void attack() {
		System.out.println("물 공격");
	}
	@Override
	void sound() {
		System.out.println("꼬북 꼬북");
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		// 피카츄, 꼬부기 객체생성
		// getName(), 등 메소드 호출하기
		
		Pikachu p = new Pikachu();
		p.getName();
		p.attack();
		p.sound();
		
		Squirtle s = new Squirtle(); 
		s.getName();
		s.attack();
		s.sound();
		}
		
		
	}


