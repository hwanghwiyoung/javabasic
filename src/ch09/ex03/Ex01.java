package ch09.ex03;

public class Ex01 {

	public static void main(String[] args) {
		int a = 0, b = 2;
		
		try {
			System.out.println(b/a);
			
			
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			System.out.println("������ ����Ǵ� ����");
		}
	}

}
