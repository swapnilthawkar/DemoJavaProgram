package com.revision.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {
	public static void main(String[] args) {
		//String [] arr = {"Apple","Banana","Apple","Apple","Papaya","Watermelon","Orange","Banana"};
		
		//HashMap<String,Integer> hm = new HashMap();
				
				
//Map<String,Long>	map=	Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		
		Map<String,Long> map = Stream.of("Apple","Banana","Apple","Apple","Papaya","Watermelon","Orange","Banana").collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		
		
		
 	}

}
