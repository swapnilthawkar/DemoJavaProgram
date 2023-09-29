package com.revision.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {
	
	public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
		
		hm.put("Cricket", "Sachin");
		hm.put("Tennis", "Fedrar");
		hm.put("Football", "Ronaldo");
		
			
		
		System.out.println("----<<<By Using EntrySet>>>----");
		Set<Map.Entry<String,String>> entrySet = hm.entrySet();
		
		Iterator<Map.Entry<String, String>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> itr2 = itr.next();
			System.out.println("Key: "+ itr2.getKey() +" :: "+"Value: "+ itr2.getValue()); 
		}
		
		System.out.println("----<<<By Using KeySet>>>----");
		
		Set<String> keySet = hm.keySet();
		Iterator <String> itr2 = keySet.iterator();
		while(itr2.hasNext()) {
			String itr3 = itr2.next();
			System.out.println("Key: "+ itr3 + " :: " + "Value: " + hm.get(itr3));
		}
		
		
	}

}
