package ch12.ex03_set;

import java.util.HashSet;

public class Ex02 {

	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		HashSet<Integer> hs3 = new HashSet<>();
		
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		
		
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		hs2.add(6);
		
	
		hs3.add(1);
		hs3.add(2);
	
		
//		// 합집합
//		hs1.addAll(hs2);
//		for(int n : hs1) {
//			System.out.print("  " + n);
//			
//		}
		System.out.println();
		// 교집합 retainAll
		
		hs1.retainAll(hs2);
		for(int s : hs1) {
			System.out.print("  " + s);
		}
	}

}
