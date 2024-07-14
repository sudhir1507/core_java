package com.consumer;

import java.util.*;
import java.util.function.Consumer;

public class AndThenConsumerApp {

	public static void main(String[] args) {
		
		Consumer<List<Integer>> modify=list->{
			 for (int i = 0; i < list.size(); i++)
	                list.set(i, 2 * list.get(i));
		};

		Consumer<List<Integer>> dispList=list->{
			list.stream().forEach(a->System.out.println(a+" "));
		};
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		modify.andThen(dispList).accept(list);
	}

}
