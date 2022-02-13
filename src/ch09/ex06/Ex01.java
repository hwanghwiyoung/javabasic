package ch09.ex06;

public class Ex01 {
	public static void main(String[] args) {
		// 예외 던지기(throws)
		
		try {
			methodA();
		}
		catch(Exception e) {
			System.out.println("메인에서 예외 처리");
		}
	}
	public static void methodA() throws Exception{
		methodB();
	}
	public static void methodB() throws Exception{
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e= new Exception();
		throw e;
	}
}


