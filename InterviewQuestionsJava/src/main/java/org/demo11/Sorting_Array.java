package org.demo11;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_Array {
	
	private void ascending_order() {
		
		String[] str = { "Manual", "sanity", "Jira", "TestNg", "Maven", "BDD cucumber" };

		Arrays.sort(str);

		System.out.println(Arrays.toString(str));

	}
	
	private void decending_order() {
		
		String[] str= {"Manual","Maven","Jira","Bdd","TestNg","Junit","API","Postman"};
		
		Arrays.sort(str, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(str));

	}

	public static void main(String[] args) {
		
		Sorting_Array SA=new Sorting_Array();
		
		SA.ascending_order();
		SA.decending_order();
		
		
	}
	
}
