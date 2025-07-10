package org.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company {
public static void main(String[] args) {
	 Map<Integer,String> m=new HashMap();
	 m.put(10, "java");
	 m.put(20, "sql");
	 m.put(30, "oops");
	 m.put(40, "oracle");
	 m.put(50, "DB");
	 m.put(60, "selenium");
	 m.put(10, "psql");
	 m.put(50, "Hadoop");
	 m.put(40, "sql");
	Set<Entry<Integer, String>> t = m.entrySet();
	for(Entry<Integer,String>h:t) {
		System.out.println(h);
		Integer dem = h.getKey();
		System.out.println(dem);
		String value = h.getValue();
		System.out.println(value);
	}
}
}
