package org.base;

import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
	
public static void main(String[] args) {
	

	Set<Integer> s = new TreeSet();
	s.add(105);
	s.add(205);
	s.add(305);
	s.add(405);
	s.add(505);
	s.add(605);
	s.add(705);
	s.add(805);
	System.out.println(s);
	for(int n:s) {
		System.out.print(n + " -> ");
	}

}

}
