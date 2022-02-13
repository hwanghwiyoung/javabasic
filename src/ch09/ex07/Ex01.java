package ch09.ex07;


class AgeException extends Exception {
	AgeException() {}
	AgeException(String message) {
		super(message);
	}
}

public class Ex01 {

	public static void ticketing(int age) throws AgeException {
		if(age <7) {
			throw new AgeException("나이가 잘못 입력되었습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			ticketing(5);
			
		} catch (Exception e) {
		}
	    
		
			
		}
		
	}
