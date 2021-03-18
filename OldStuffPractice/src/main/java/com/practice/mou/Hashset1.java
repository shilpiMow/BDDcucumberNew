package com.practice.mou;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
	public static void main(String[]args) {
		
//		HashSet<Integer> h= new HashSet<Integer>();
//		h.add(5);
//		h.add(10);
//		h.add(15);
		//System.out.println(h.contains(10));
		
	HashSet<Integer> hashbrowns= new HashSet<Integer>();
	hashbrowns.add(14);
	hashbrowns.add(20);
	hashbrowns.add(30);
	hashbrowns.add(null);
	hashbrowns.add(14);// duplicate value is not allowed
	Iterator<Integer> it = hashbrowns.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
//	Object[] h=hashbrowns.toArray();
//	System.out.println(h[2]);
//	
	}

}
