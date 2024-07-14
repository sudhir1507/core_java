package com.Function;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		Function<Integer,Double> half=a->a/2.0;
		
		half=half.andThen(a->a*3);  //andThen method
		System.out.println(half.apply(10));    //apply method
		
	}

}
