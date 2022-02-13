package ch10.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		
		System.out.println(v1.hashCode());
		System.out.println(v1.toString());
	}

}

class Value {
	private int value;
	
	Value(int value) {
		this.value = value;
		
	}
}