package org.base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class demo1 {
	public static void main(String[] args) {
		
	
	List l= new Vector();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(50);
	l.add(167);
	
	int size = l.size();
	System.out.println(size);
	int indexOf = l.indexOf(167);
	System.out.println(indexOf);
	Object get = l.get(4);
	System.out.println(get);
}
}