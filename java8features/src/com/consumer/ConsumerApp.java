package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
          System.out.println(t);		
	}
	
}
public class ConsumerApp {

	public static void main(String[] args) {
		MyConsumer m=new MyConsumer();
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		al.forEach(m);
		

	}

}
