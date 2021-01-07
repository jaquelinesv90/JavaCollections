package com.collections.hashMap;

import java.util.HashMap;
import java.util.Map;

/* An object that maps keys to values
 * 
 * java.util.HashMap<K,V>
 * 
 * K - the type of keys maintened by this map
 * V - the type of mapped values 
 * 
 * - HashMap stores only object references.So primitives must be
 * used with their corresponding wrapper classes.
 * - Implements Cloneable and Serializable
 * 
 * 
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(4,"Alabama");
		map.put(6,"Arizona");
		map.put(8,"Florida");
		map.put(10,"Georgia");
		map.put(1,"Hawaii");
		
		String text = map.get(4);
		System.out.println("text "+text);
		
		
		//method keySet returns a Set, it means a collection of unique elements 
		for(Integer m : map.keySet()) {
			System.out.println(m + " ");
		}
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ":" + value);
		}
	}
}
