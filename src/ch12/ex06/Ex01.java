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
		System.out.println("���̵� �Է��ϼ���");
		String id = sc.nextLine();
		
		// ���׿�����
		String result = map.containsKey("id001")?  "���̵�����" : "���̵����";
		System.out.println(result);
		
		
		//value ��й�ȣ ���
		System.out.println("��й�ȣ : " + map.get(id));
	}

}
