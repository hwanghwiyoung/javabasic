package ch10.ex04;

import java.time.LocalDateTime;

public class Ex05 {

	public static void main(String[] args) {
		// ������� üũ
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		
		
		LocalDateTime end_time = LocalDateTime.of(2017, 6, 24, 12, 00);
		System.out.println(end_time);
		
		if(ldt.isAfter(end_time) ) {
			System.out.println("��������� �������ϴ�.");
		} else {
			System.out.println("��������� ���ҽ��ϴ�.");
			
		}
		
		
	}

}
