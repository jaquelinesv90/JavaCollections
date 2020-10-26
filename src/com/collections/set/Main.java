package com.collections.set;

import java.util.HashSet;
import java.util.Set;


/*
 * No duplicate elements
 * unordered collection
 * 
 */

public class Main {
	
	
	public static void main(String[] args) {
		
		Set<String> variable = new HashSet<String>();
		addSet(variable);
		removeSet(variable);
	}
	
	public static void addSet(Set<String> variable) {
		variable.add("Jaqueline,Josh,Jhon");
	}
	
	public static void removeSet(Set<String> variable) {
		variable.remove("jaqueline");
	}

}
