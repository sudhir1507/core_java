package com.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerApp {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(430);
			
		BiConsumer<ArrayList<Integer>,ArrayList<Integer>> equals=(lista,listb)->{
			if(lista.size()!=listb.size()) {
				System.out.println("False");
			}else {
				for(int i=0;i<lista.size();i++) {
					if(lista.get(i)!=listb.get(i)) {
						System.out.println("false");
						return;
					}
				}
				System.out.println("true");
			}
		};
		equals.accept(list1, list2);

	}

}
