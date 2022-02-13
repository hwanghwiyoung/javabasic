package ch09.ex02;

public class Ex03 {

	public static void main(String[] args) {

		
		try {
			int a = Integer.parseInt("tret");
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("데이터 타입을 확인하세요");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다");
		}
		
		
	}

}
