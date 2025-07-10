package org.demo;
//array1
public class Array {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int b =0;
	for(int c:a) {
		b+=c;
		System.out.println(b);
	}
}
}
