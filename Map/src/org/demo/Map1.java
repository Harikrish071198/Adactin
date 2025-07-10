package org.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {
	public static void main(String[] args) {
	Map<String,String> m=new HashMap();
	m.put("vel","selenium");
	m.put("ganesh","selenium");
	m.put("dhinesh","framework");
	m.put("vengat","corejava");
	m.put("subash","jira");
	Set<Entry<String, String>> k = m.entrySet();
	for(Entry<String,String>r:k) {
		System.out.println(r);
		String com = r.getKey();
		System.out.println(com);
		String value = r.getValue();
		System.out.println(value);
	}
	}

}
