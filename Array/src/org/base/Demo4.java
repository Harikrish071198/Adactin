package org.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		//List<Integer> l = new LinkedList<Integer>();
		List <Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(40);
		l.add(10);
//		
//		
//
//				System.out.print(l+"\n");
//				int size = l.size();
//				System.out.println(size);
//				Object object = l.get(4);
//				System.out.println(object);
//				int indexOf = l.indexOf(40);
//				System.out.println(indexOf);
//				boolean contains = l.contains(78);
//System.out.println(contains);
//Object remove = l.remove(4);
//System.out.println(remove);
	for(Integer i=0; i<=l.size();i++) {
		System.out.println(i);
	
	
	}	}
}
