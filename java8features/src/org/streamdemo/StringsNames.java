package org.streamdemo;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsNames {

	public static void main(String[] args) {
		Arrays.asList("Gajanan","ganesh","vishal","dinesh","shyam","mahesh","sumit","rajesh").stream()
		.filter((String s)->s.endsWith("sh")).collect(Collectors.toList()).
		forEach((String s)->System.out.println(s));
		
	
	}

}
