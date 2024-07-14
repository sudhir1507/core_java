package com.Function;

import java.util.function.Function;

public class FunctionDIvByTwo {

	public static void main(String[] args) {
		Function<Integer,Integer> f=(Integer t)->t/2;
		Function<Integer,Integer> f1=(Integer t)->t*5;
		Function<Integer,Integer> f2=f1.andThen(f);
		int result=f2.apply(10);
		System.out.println(result);
	}
}
