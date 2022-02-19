package ch12.ex06;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// HashMap
		HashMap<String, String> map = new HashMap<>();
		
		map.put("id001", "1111");
		map.put("id002", "2222");
		map.put("id003", "3333");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		
		// 삼항연산자
		String result = map.containsKey("id001")?  "아이디있음" : "아이디없음";
		System.out.println(result);
		
		
		//value 비밀번호 얻기
		System.out.println("비밀번호 : " + map.get(id));
	}

}
