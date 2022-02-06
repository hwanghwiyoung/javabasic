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
	
	//������
	Pikachu() {
		this.name = "��ī��";
	}
	@Override
	void attack() {
		System.out.println("���� ����");
	}
	@Override
	void sound() {
		System.out.println("��ī ��ī");
	}
}

class Squirtle extends Pokemon {
	
	//������
	Squirtle() {
		this.name = "���α�";
	}
	
	
	@Override
	void attack() {
		System.out.println("�� ����");
	}
	@Override
	void sound() {
		System.out.println("���� ����");
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		// ��ī��, ���α� ��ü����
		// getName(), �� �޼ҵ� ȣ���ϱ�
		
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


