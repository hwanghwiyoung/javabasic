package ch09.ex02;

public class Ex02 {

	public static void main(String[] args) {
		int a= 3;
		int b= 0;
		
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("0으로 못 나눕니다.");
		} catch (Exception e) {
			System.out.println("예외가 발생 했습니다.");
		}
		
		System.out.println("finish");
		
	}
}
