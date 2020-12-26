package com.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * implementation of List interface
 * dynamic array for storing the elements
 * no size limit
 */
public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(10);
		array.add(120);
		
		//Indexed for loop iteration - iteration 01
		for(int i=0;i< array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		//Indexed for loop iteration - iteration 02
		for(Integer ar : array) {
			System.out.println(ar);
		}
		
		//removing the last element
		array.remove(array.size() -1);
		
		//removing the first element
		array.remove(0);
		
		//List interface
		List<String> list = new ArrayList<String>();
	}
}
