package ch09.ex02;

public class Ex02 {

	public static void main(String[] args) {
		int a= 3;
		int b= 0;
		
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("0���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("���ܰ� �߻� �߽��ϴ�.");
		}
		
		System.out.println("finish");
		
	}
}
