package com.test.demo;

import java.util.HashMap;
import java.util.Map;

public class StringHandling {
public static void main(String[] args) {
	String s="Harish Harish";
	char[] arr =s.toCharArray();
	Map<Character,Integer> map = new HashMap<>();
	for (char c : arr) {
		if(!map.containsKey(c) && !" ".equals(String.valueOf(c)))
		{
			map.put(c, 1);
		}
		else
		{
			map.put(c, map.get(c)+1);
		}
	}
	
	for (Map.Entry entry : map.entrySet()) {
		System.err.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		
	}
}
}
