package ch06.ex04_method;

public class Ex01 {

	//���� ���ϱ�
	int getArea(int width, int height) {
		return width * height;
	}
	
	// �Ű������� ����, Ÿ���� �ٸ� ��� �ٸ� �޼ҵ�� �ν��Ѵ�.
	// �����ε�(OverLoading)�̶�� �Ѵ�.
	void getArea(String width, String height) {
		//return width * height;
		System.out.println();
	}
	
	public static void main(String[] args) {
		Ex01 m = new Ex01();
		
		System.out.println(m.getArea(3,4));
	}

}
