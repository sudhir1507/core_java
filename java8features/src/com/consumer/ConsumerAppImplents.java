package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class ConsumeImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}
public class ConsumerAppImplents {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ConsumeImpl obj= new ConsumeImpl();
		list.forEach(obj);
	}

}
