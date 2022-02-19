package ch12.ex05;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// Queue
		
		Queue<String> q = new LinkedList<>();
		
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		System.out.println(q);
		
		
		System.out.println(q.element());
		
		q.remove();
		System.out.println("remove : " + q);
		
		
	}

}
