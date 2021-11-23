package MapInterfaceConcept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {

		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("name", "Naveen");
		userMap.put("age", "30");
		userMap.put("city", "delhi");
		userMap.put(null, "Mumbai");
		userMap.put("city2", null);

		System.out.println(userMap.size());
		for (Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		Hashtable<String, Integer> productTable = new Hashtable<String, Integer>();
		productTable.put("Apple macbook", 2000);
		productTable.put("Apple iphone x", 1500);
		// productTable.put(null, 1);
		// productTable.put("1", null);
		System.out.println(productTable);

	}

}
