package ch09.ex05;

public class Ex01 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���� ����");
			throw e;
			
			
		} catch (Exception e) {
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());
		}
	}

}
