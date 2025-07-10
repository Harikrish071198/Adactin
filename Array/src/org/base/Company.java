package org.base;

public class Company {
	public static void main(String[] args) {
		int a[][]=new int [2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
			}
		}
		for(int []b:a){
			for (int c:b) {
				System.out.println(c);
			}
		}
	}

}
