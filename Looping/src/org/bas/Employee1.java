package org.bas;

public class Employee1{
	private void continueLoop(int init,int con) {
		for(int i=init; i<=con;i++) {
			if(i==2) {
				System.exit(0);
			}
			System.out.println(i);
		}

	}
	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.continueLoop(0, 5);
	}
}

