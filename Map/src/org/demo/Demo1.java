package org.demo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
public static void main(String[] args) {
	Map<Character,Integer> m=new TreeMap();
	m.put('!', 10);
	m.put('@', 20);
	m.put('#', 30);
	m.put('$',40 );
	m.put('%', 50);  
	 m.put('^', 60);
	 m.put('&', 10);
	 m.put('*', 50);
	 m.put('(', 409);
	 Set<Entry<Character, Integer>> base = m.entrySet();
	 for(Entry<Character,Integer>f:base) {
		 System.out.println(f);
		 Character print = f.getKey();
		 System.out.println(print);
		 Integer value = f.getValue();
		 System.out.println(value);
	 }
}
}
