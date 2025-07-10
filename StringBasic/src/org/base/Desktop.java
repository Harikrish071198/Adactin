package org.base;

public class Desktop {
public static void main(String[] args) {
	String s = "Java Selenium";
	String s1="  java selenium  ";
	int length=s.length();
	System.out.println(length);
	boolean empty = s.isEmpty();
	System.out.println(empty);
	char charAt = s.charAt(3);
	System.out.println(charAt);
	int indexOf = s.indexOf("S");
	System.out.println(indexOf);
	int lastIndexOf = s.lastIndexOf("a");
	System.out.println(lastIndexOf);
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	boolean startsWith = s.startsWith("Jav");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("v");
	System.out.println(endsWith);
	String concat = s.concat(s1);
	System.out.println(concat);
	boolean contains = s.contains("v");
	System.out.println(contains);
	boolean equals = s.equals(s1);
	System.out.println(equals);
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	int compareTo = s.compareTo(s1);
	System.out.println(compareTo);
	String replace = s.replace("Java", "python");
	System.out.println(replace);
	String replaceAll = s.replaceAll("Java Selenium", "full stack");
	System.out.println(replaceAll);
	String trim = s1.trim();
	System.out.println(trim);
	String substring = s.substring(3);
	System.out.println(substring);
	String substring2 = s1.substring(4,11 );
	System.out.println(substring2);
	
}
}
 