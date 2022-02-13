package ch10.ex04;

import java.util.Calendar;

public class Ex04 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		
		
		System.out.println(year + " ³â " + month + " ¿ù " + date + " ÀÏ ");
	}

}
