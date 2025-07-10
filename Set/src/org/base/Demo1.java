package org.base;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Demo1 {
	public static void main(String[] args) {
	
Set s1=new LinkedHashSet();
s1.add(10);
s1.add(20);
s1.add(30);
s1.add(90);
s1.add(10);
s1.add(10);
s1.add(40);
s1.add(50);
System.out.println(s1);
 Set s2= new LinkedHashSet();
 s2.add(10);
 s2.add(20);
 s2.add(440);
 s2.add(280);
 s2.add(20);
 System.out.println(s2);
 s1.addAll(s2);
 System.out.println(s1);
 List l= new ArrayList();
 l.add(20);
 l.add(20);
 l.add(20);
 l.add(200);
 l.add(201);
 l.add(20278);
 s1.addAll(l);
 System.out.println(s1);
 Set s4=new HashSet();
 s4.add(20);
 s4.add(20278);
 s4.add(220);
 s4.add(210);
 s4.add(30);
 s4.add(20);
 s4.add(10);
 System.out.println(s4);
 l.addAll(s4);
 System.out.println(l);
 
}
}