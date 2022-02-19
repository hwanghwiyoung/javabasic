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
		
		System.out.println("초기상태 : " + al);
		System.out.println("인덱스 1에 b 추가 : ");
		al.add(1, "b");
		System.out.println(al);
		
		
		//c삭제 
		System.out.println("c삭제 : ");
		al.remove(2);
		System.out.println(al);
		
		// d 가져오기 : get
		System.out.println("d 가져오기 : ");
		System.out.println(al.get(3));
		
		
	}

}
