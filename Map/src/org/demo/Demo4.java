package org.demo;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo4 {
public static void main(String[] args) {
	Map<String,String> k=new Hashtable();
	k.put("vel","selenium");
	k.put("ganesh", "framework");
	k.put("Dhinesh","oracle");
	k.put("vengat", "corejava");
	k.put("subash", "jira");
	Set<Entry<String, String>> demo2 = k.entrySet();
	for(Entry<String,String> h:demo2){
		System.out.println(h);
	}
}
}
