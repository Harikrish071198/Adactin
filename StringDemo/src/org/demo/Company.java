package org.demo;

public class Company {
public static void main(String[] args) {
	String s = "java";
	String s1="maven";
	String s2="java";
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	
	String s3 = new String("java");
	String s4= new String("maven");
	String s5 = new String("java");
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));
	System.out.println(System.identityHashCode(s5));
	
	
	String s6="java";
	String s7="Selinium";
	String concat = s6.concat(s7);
	System.out.println(concat);
	System.out.println(System.identityHashCode(s6));
	System.out.println(System.identityHashCode(s7));
	System.out.println(System.identityHashCode(concat));
	
	StringBuffer s8 = new StringBuffer("java");
	StringBuffer s9 = new StringBuffer("selenium");
	StringBuffer append =s8.append(s9);
	System.out.println(append);
	System.out.println(System.identityHashCode(s8));
	System.out.println(System.identityHashCode(s9));
	System.out.println(System.identityHashCode(append));
	
	driver.
}
}
