package com.revision.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demoStream {
	public static void main(String[] args) {
		
		List<String> title = Stream.of("prefix", "name", "postfix").filter(i-> i.startsWith("p")).map(String::toUpperCase).collect(Collectors.toList());
		         System.out.println(title);
	}

}
