package ch08.ex02_interface;

interface Pokemon {
	String name = "pockemon";	// public static final ��������
	
	void attack();		// public abstract ��������
	void sound();
	
	// �������̽��� �߻�޼ҵ常 ���� �� �� �ִ�. 
//	public String getName() {
//		return this.name;
//	}
}

class Pikachu implements Pokemon {
	
	@Override
	public void attack() {// ��ü������ ����
		System.out.println("���� ����");
	}
	
	@Override
	public void sound() {
		System.out.println("�������");
	}
}

class Squirtle implements Pokemon {
	@Override
	public void attack() {
		System.out.println("�� ����");
	}
	
	@Override
	public void sound() {
		System.out.println("���� ����");
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