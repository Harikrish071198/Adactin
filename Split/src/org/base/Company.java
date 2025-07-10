package org.base;

public class Company {
public static void main(String[] args) {
	String s= "Java Application";
	String[] split = s.split("a");
	for(int i=0;i<split.length;i++) {
	System.out.println(split[i]);
}
}
}