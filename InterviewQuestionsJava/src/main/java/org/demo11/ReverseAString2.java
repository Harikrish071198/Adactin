package org.demo11;

public class ReverseAString2 {
	public static void main(String[] args) {

		String str="Welcome To Java";
		
		String[] words=str.split("\\s");
		
		String reverseword="";
		
		for(String w:words) {
			
		StringBuilder sb=new StringBuilder(w);
		
		sb.reverse();
		
		reverseword=reverseword+sb.toString()+" ";
		}
		
		System.out.println(reverseword);
	}
}
