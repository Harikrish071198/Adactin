package org.demo;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String studentId = s.nextLine();
	System.out.println("studentId is "+studentId);
	String studentName = s.next();
	System.out.println("studentName is "+studentName);
	int Mark1 = s.nextInt();
	System.out.println("mark 1 is "+Mark1);
	int Mark2 = s.nextInt();
	System.out.println("Mark 2 is "+Mark2);
	int Mark3 = s.nextInt();
	System.out.println("mark3 is "+Mark3);
	int Mark4 = s.nextInt();
	System.out.println("mark 4 is "+ Mark4);
	int Mark5 = s.nextInt();
	System.out.println("Mark5 is "+Mark5);
	
	int total=Mark1+Mark2+Mark3+Mark4+Mark5;
	Double Average=(double) total/5;
	System.out.println(Average);
	
}
}