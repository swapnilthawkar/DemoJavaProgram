package com.revision.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
	public static void main(String[] args) {
		
		String str = "My name is Swapnil live in Amravati my work is live simple";
		String str2 = str.toLowerCase();
		String[] str3 = str2.split(" ");
		Map<String,Long> map = Arrays.stream(str3).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	} 
}