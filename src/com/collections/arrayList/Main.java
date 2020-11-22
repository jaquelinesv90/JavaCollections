package com.collections.arrayList;

import java.util.ArrayList;

/*
 * implementation of List interface
 * dynamic array for storing the elements
 * no size limit
 */
public class Main {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Sachin");
		al.add("Rahul");
		al.add(10);
		
		String s1 = (String)al.get(0);
		String s2 = (String)al.get(1);
		
		Integer s3 = (Integer)al.get(2);
	}
	
	
}
