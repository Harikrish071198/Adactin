package org.base;

public class Length {
public static void main(String[] args) {
	String s1="GreensTechnology";
	String s2="SeleniumAutomationtool";
	String s3="velmurugan";
	String s4="javaprogram";
	String s5="90987654356";
	int length = s1.length();
	System.out.println(length);
	int length2 = s2.length();
	System.out.println(length2);
	int length3 = s3.length();
	System.out.println(length3);
	int length4 = s4.length();
	System.out.println(length4);
	int length5 = s5.length();
	System.out.println(length5);
	int lastIndexOf = s1.lastIndexOf("o");
	System.out.println(lastIndexOf);
	int indexOf = s2.indexOf("o");
	System.out.println(indexOf);
	int indexOf2 = s3.indexOf("n");
	System.out.println(indexOf2);
	int indexOf3 = s4.indexOf("p");
	System.out.println(indexOf);
	char charAt = s5.charAt(8);
	System.out.println(charAt);
	
}

}