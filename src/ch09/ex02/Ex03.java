package ch09.ex02;

public class Ex03 {

	public static void main(String[] args) {

		
		try {
			int a = Integer.parseInt("tret");
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("������ Ÿ���� Ȯ���ϼ���");
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�");
		}
		
		
	}

}
