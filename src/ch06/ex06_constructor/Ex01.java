package ch06.ex06_constructor;

class CellPhone {
	String model = "Galacy";
	String color;
	int capacity;
	
	String getColor() {
		return "red";
	}
	//������
	CellPhone() {
		
	}
	CellPhone(String color, int capacity) {
		this.color = color;
		this.capacity = capacity;
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// ��ü ������ �ʱ�ȭ�� ���� �� ���
		CellPhone phone1 =  new CellPhone();
		phone1.capacity = 64;
		phone1.color = "red";
		
				
		
		// �����ڸ� �̿��� �ʱ�ȭ
		CellPhone phone2 = new CellPhone("silver",128);
		System.out.println(phone2.color);
		System.out.println(phone2.capacity);
	}

}
