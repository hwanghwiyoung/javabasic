package ch09.ex06;

public class Ex02 {

	public static void main(String[] args) {
		try {
			findClass();
			
		} catch (Exception e) {
			System.out.println("z");
		}
		
	}
	
	public static void findClass() throws Exception {
		Class.forName("java.lang.string");
	}

}
