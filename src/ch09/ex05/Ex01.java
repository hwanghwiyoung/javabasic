package ch09.ex05;

public class Ex01 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의 예외");
			throw e;
			
			
		} catch (Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}

}
