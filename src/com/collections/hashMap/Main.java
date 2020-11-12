package com.collections.hashMap;

import java.util.HashMap;

/* An object that maps keys to values
 * 
 * java.util.HashMap<K,V>
 * 
 * K - the type of keys maintened by this map
 * V - the type of mapped values 
 */
public class Main {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("AL","Alabama");
		map.put("AZ","Arizona");
		map.put("FL","Florida");
		map.put("GA","Georgia");
		map.put("HI","Hawaii");
		
		
		//method keySet returns a Set, it means a collection of unique elements 
		for(String m : map.keySet()) {
			System.out.println(m + " ");
		}
		
	}
}
