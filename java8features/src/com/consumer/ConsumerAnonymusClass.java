package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerAnonymusClass {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("parshuram");
		list.add("Pravin");
		list.add("mayur");
		list.add("f");
		list.add("parteek");
		list.add("Pushpraj");
		
		Consumer<String> c=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		list.forEach(c);
	}

}
