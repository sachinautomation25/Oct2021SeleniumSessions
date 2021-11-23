package com.qa.arraylist;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		//add value in arraylist
		
		al.add(10);
		al.add(10.4);
		al.add("rahul");
		al.add('m');
		al.add(null);
		al.add(true);
		
		//size of arralist
		System.out.println(al.size());
		
		al.add("arora");
		
		System.out.println(al.size());
		
		//print values from arraylist
		System.out.println(al);
		
		//get value 
		System.out.println(al.get(0));
		
		//get all values from arraylist
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(al.contains('m'));
		
		al.remove(1);
		System.out.println(al.size());
		System.out.println(al.get(1));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.indexOf(10));
	}
}
