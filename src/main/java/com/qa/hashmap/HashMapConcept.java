package com.qa.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**in any map the values are stored in key and value pair. key+value form element
 * 
 * @author Dell
 *
 */
public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put(1, "rahul");
		hm.put(2, "naveen");
		hm.put(3, "deepak");
		hm.put(null, null);
		hm.put(null, " ");
		
		
		System.out.println(hm);
		System.out.println(hm.get(null));
		System.out.println(hm.get("4"));
		
		System.out.println(hm.size());
		
	Set s=	hm.keySet();
	Iterator itr=s.iterator();
	while (itr.hasNext()) {
		Object key=itr.next();
		System.out.println(key +" "+hm.get(key));
	}
	}
}
