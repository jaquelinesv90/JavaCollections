package com.collections.forLoop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//traditional for- before Java 5
		List<Integer> list = Arrays.asList(1,4,5,6,7,8,9);
		for(Iterator<Integer> number = list.iterator(); number.hasNext();) {
			boolean integer = number.hasNext();
			System.out.println(integer);
		}
		
		//For-Each after Java 5
		List<Integer> list2 =  Arrays.asList(1,4,5,6,7,8,9);
		for(Integer number: list2) {
			System.out.println(number);
		}
	}
	
	
}
