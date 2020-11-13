package com.collections.treeMap;

import java.util.Map;
import java.util.TreeMap;

/*
 * java.util.TreeMap<K,V>
 * 
 * K - the type of keys maintened by this map
 * V - the type of mapped values
 * 
 *  only unique elements
 *  maintains ascending order
 *  cannot have a null key but can have multiple null values
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(3, "United States");
		map.put(2, "Czech Republic");
		map.put(1, "Germany");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " +m.getValue());
		}
	}
	
}
