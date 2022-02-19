package ch12.ex03_set;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// Set
		
		HashSet<String> hs = new HashSet();
		hs.add("a");
		hs.add("b");
		hs.add("t");
		hs.add("a");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// TreeSet
		TreeSet<String> ts = new TreeSet<>();
		ts.add("a");
		ts.add("b");
		ts.add("t");
		ts.add("a");
		
		Iterator it1 = ts.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		
		
	}

}
