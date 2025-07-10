package org.demo11;

import java.util.Iterator;

public class JavaProgram11 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;

		int sum;
		System.out.println(a + " " + b);
		for (int i = 2; i <= 5; i++) {
			sum = a + b;
			System.out.println(" " + sum);
			a = b;

			b = sum;
		}
		
	}
}
