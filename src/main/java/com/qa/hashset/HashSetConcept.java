package com.qa.hashset;

import java.util.HashSet;
import java.util.Iterator;
/**
 * in array list insersion order is maintained
 * duplicate values are allowed in arraylist
 * when maintaing order is important and duplicate values present go for array list
 * in hashset inserstion order is not maintained
 * duplicate values are not allowed in set
 * when unique values availble then go for set
 * @author Dell
 *
 */

public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add(10);
		h.add("rahul");
		h.add('d');
		h.add(10.10);
		h.add(true);
		h.add(10);
		
		System.out.println(h);
		System.out.println(h.size());
		
		Iterator itr=h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
