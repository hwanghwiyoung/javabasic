package ch12.ex04;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// ArrayList
		
		ArrayList al = new ArrayList(10);
		al.add("a");
		al.add("c");
		al.add("e");
		al.add("d");
		
		System.out.println("�ʱ���� : " + al);
		System.out.println("�ε��� 1�� b �߰� : ");
		al.add(1, "b");
		System.out.println(al);
		
		
		//c���� 
		System.out.println("c���� : ");
		al.remove(2);
		System.out.println(al);
		
		// d �������� : get
		System.out.println("d �������� : ");
		System.out.println(al.get(3));
		
		
	}

}
