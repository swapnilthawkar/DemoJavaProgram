package com.revision.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapToStream {
	
	
	public static <K,V> Stream<Map.Entry<K,V>> convertMapToStream(Map<K, V> map){
		
		return map.entrySet().stream();
		
	}
	
	public static void main(String[] args) {
		
		 HashMap<String,String> hm = new HashMap<>();
			
			hm.put("Cricket", "Sachin");
			hm.put("Tennis", "Fedrar");
			hm.put("Football", "Ronaldo");
			
	}
	
			
	}


 