package ch12.ex02;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// 제네릭(Generic)
		// 값 입력시 타입체크 강화
		
		
		// 제네릭을 사용하지 않을 경우
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("30");
		
		
		// 제네릭을 사용 할 경우
		ArrayList<Integer> list2 = new ArrayList();
		list2.add(10);
		list2.add(20);
		//list2.add("30");

	}

}
