package ch12.ex05;

import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		// Stack
		Stack s = new Stack<>();
		
		
		// ������ �ֱ�(push)
		// a,b,p,c
		
		s.push("a");
		s.push("b");
		s.push("p");
		s.push("c");
		System.out.println(s);
		
		// top�� ������ ������ (pop)
		
		s.pop();
		System.out.println(s);
		
		// top�� ������ �б� (peek)
		System.out.println(s.peek());
		
		// search()
		System.out.println(s.search("a"));
		System.out.println(s.search("b"));
		System.out.println(s.search("p"));
	}

}
