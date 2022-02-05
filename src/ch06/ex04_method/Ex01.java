package ch06.ex04_method;

public class Ex01 {

	//넓이 구하기
	int getArea(int width, int height) {
		return width * height;
	}
	
	// 매개변수의 갯수, 타입이 다를 경우 다른 메소드로 인식한다.
	// 오버로딩(OverLoading)이라고 한다.
	void getArea(String width, String height) {
		//return width * height;
		System.out.println();
	}
	
	public static void main(String[] args) {
		Ex01 m = new Ex01();
		
		System.out.println(m.getArea(3,4));
	}

}
