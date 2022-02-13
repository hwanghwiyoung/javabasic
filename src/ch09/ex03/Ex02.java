package ch09.ex03;

class A {
	private int[] arr = new int[3];
	
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	public void divide(int a, int b) {
		try {
			System.out.println(arr[a]/arr[b]);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		
		} catch (Exception e) {
			System.out.println("���� �߻�");
			
		
	}	
}


public class Ex02 {

	public void main(String[] args) {
		A a = new A();
		a.divide(1,0); // 10/0
	//	a.divide(3,0); // array exception
	//	a.divide(0,0); // ����
		
	}
}
}



