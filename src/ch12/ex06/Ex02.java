package ch12.ex06;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id001", "1111");
		map.put("id002", "2222");
		map.put("id003", "3333");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 >>>");
			String id = sc.nextLine();			
			System.out.print("비밀번호 >>>");
			String password = sc.nextLine();
			// 종료 체크
			if(id.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 아이디 불일치 체크
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디가 없습니다");
				continue;
				
			}
			
			
			// 비밀번호 체크
			if(!map.get(id).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			} else {
				System.out.println("아이디 비밀번호가 일치합니다");
				break;
			}
				
			
		}

	}

}
