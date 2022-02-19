package ch12.ex02;

class Shape<T> {
	T width;
	T height;
}

public class Ex02 {

	public static void main(String[] args) {
		// Integer 타입
		Shape<Integer> s1 = new Shape<>();
		s1.height = 20;
		s1.width = 30;
		
		
		// String 타입
		
		Shape<String> s2 = new Shape<>();
		s2.height = "10";
		s2.width = "15";
	}

}
