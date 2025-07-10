package org.base;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	l.add(50);
	System.out.println(l);
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
}}