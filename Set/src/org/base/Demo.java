package org.base;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		Set s =new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
	System.out.println(s);
	Set s1= new LinkedHashSet();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(40);
	s1.add(50);
	s1.add(60);
	s1.add(70);
	s1.add(80);
	s1.add(90);
	s1.add(10);
	s1.add(20);
	System.out.println(s1);
	Set<Integer> s3=new TreeSet();
	s3.add(10);
	s3.add(20);
	s3.add(30);
	s3.add(40);
	s3.add(50);
	s3.add(60);
	s3.add(70);
	s3.add(80);
	s3.add(90);
	s3.add(10);
	s3.add(20);
	System.out.println(s3 );
	
		
	}

}
