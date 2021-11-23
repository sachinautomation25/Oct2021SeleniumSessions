package com.qa.arraylist;

import java.util.ArrayList;

/**
 * Restricted(Generics) and non restricted(Raw Type)
 * 
 * @author Dell
 *
 */
public class ArrayListGenerics {

	public static void main(String[] args) {

//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(10);

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("rahul");
		al2.add(null);
		int sum = sum("The 10 hello 20");
		System.out.println(sum);
	}

	public static int sum(String str) {

		String s[] = str.split(" ");
		int sum = 0;
		for (String ss : s) {
			try {
				int num = Integer.parseInt(ss);
				sum = sum + num;

			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
		return sum;
	}
}
