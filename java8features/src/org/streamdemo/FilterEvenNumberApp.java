package org.streamdemo;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilterEvenNumberApp {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,23,35,30,50,75);
		Stream<Integer> stream1=list.stream();
		Predicate<Integer> p=new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}	
		};
		Stream<Integer> stream2=stream1.filter(p);
		List<Integer> newlist=stream2.collect(Collectors.toList());
		Consumer<Integer> c=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t+"\t");
				
			}
		};
		newlist.forEach(c);
	}

}
