package org.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap();
	m.put(10, "java");
	m.put(20, "sql");
	m.put(30,"oops");
	m.put(40,"sql");
	m.put(50,"oracle");
	m.put(60,"DB");
	m.put(10,"selenium");
	m.put(50,"psql");
	m.put(40,"hadoop");
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	for(Entry<Integer,String> e:entrySet) {
		System.out.println(e );
		
	}
}
}
