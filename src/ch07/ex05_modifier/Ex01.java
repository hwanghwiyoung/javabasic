package ch07.ex05_modifier;

public class Ex01 {
	// ���� �������� ����
	// �ܺο��� ������ �� �ִ� ������ ������ �����ش�.
	
	public int data1 = 10;		// ���� ������ ����
	protected int data2 = 10;	// ���� ��Ű�� �������� �ڼ� Ŭ�������� ���� ����
	int data3 = 10;				// ���� ��Ű�� �������� ���� ����
	private int data4 = 10;		// ���� Ŭ���� �������� ���� ����
	
	void testPrivate() {
		System.out.println(data4);
	}
}

class Access {
	void test() {
		Ex01 am = new Ex01();
		
		// private �����ڴ� ���� Ŭ������������ ���� ����
		//System.out.println(am.data4);	
		
		
		// public �����ڸ� ����Ͽ� �ٸ� package�� Ŭ���� ����� �����ϱ�
		//ch07.ex03_super.Student s= new ch07.ex03_super.Student("ȫ�浿", "sbs");
		//System.out.println(s.school);
		
	}
}
