package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerLambdaApp {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("parshuram");
		list.add("Pravin");
		list.add("mayur");
		list.add("f");
		list.add("parteek");
		list.add("Pushpraj");
		
//		Consumer<String> s=(String t)->{
//			System.out.println(t);
//		};
//		list.forEach(s);
		
		list.forEach((String t)->System.out.println(t));
	}

}
