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
			throw new AgeException("���̰� �߸� �ԷµǾ����ϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			ticketing(5);
			
		} catch (Exception e) {
		}
	    
		
			
		}
		
	}
