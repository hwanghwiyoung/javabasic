package ch10.ex05;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// until random 이용하기
		Random r1 = new Random(3);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(r1.nextInt());
		}

	}

}
