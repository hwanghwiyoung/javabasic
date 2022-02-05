package ch06.ex06_constructor;

class CellPhone {
	String model = "Galacy";
	String color;
	int capacity;
	
	String getColor() {
		return "red";
	}
	//생성자
	CellPhone() {
		
	}
	CellPhone(String color, int capacity) {
		this.color = color;
		this.capacity = capacity;
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성과 초기화를 따로 할 경우
		CellPhone phone1 =  new CellPhone();
		phone1.capacity = 64;
		phone1.color = "red";
		
				
		
		// 생성자를 이용한 초기화
		CellPhone phone2 = new CellPhone("silver",128);
		System.out.println(phone2.color);
		System.out.println(phone2.capacity);
	}

}
