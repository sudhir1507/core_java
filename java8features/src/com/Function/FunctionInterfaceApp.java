package com.Function;

import java.util.function.Function;

public class FunctionInterfaceApp {

	public static void main(String[] args) {
		Function<Integer, Integer> sq=(Integer t)->{
			return t*t;
			
		};
		Function<Integer, Integer> f1=(Integer tt)->{
			return tt*10;
		};
		
		Function<Integer,Integer> f2=sq.andThen(f1);
		int result=f2.apply(2);
		System.out.println(result);
	}

}
