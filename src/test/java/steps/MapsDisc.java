package steps;

import java.util.HashMap;

public class MapsDisc {
	
	
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("India", "New Delhi");
		
		hm.put("USA", "Washington DC");
		
		hm.put("Australia", "Queen");
		
		hm.put("South Africa", "Capetown");
		
		hm.put("South Africa", "Pretoria");
		System.out.println(hm);
		
		
		String value = hm.get("India");
		
		System.out.println(value);
		
	}

}
