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
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵� >>>");
			String id = sc.nextLine();			
			System.out.print("��й�ȣ >>>");
			String password = sc.nextLine();
			// ���� üũ
			if(id.equals("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			// ���̵� ����ġ üũ
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ���̵� �����ϴ�");
				continue;
				
			}
			
			
			// ��й�ȣ üũ
			if(!map.get(id).equals(password)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			} else {
				System.out.println("���̵� ��й�ȣ�� ��ġ�մϴ�");
				break;
			}
				
			
		}

	}

}
