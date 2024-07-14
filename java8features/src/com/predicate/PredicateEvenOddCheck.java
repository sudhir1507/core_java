package com.predicate;

import java.util.function.Predicate;

public class PredicateEvenOddCheck {

	public static void main(String[] args) {
		
		//boolean b=((Predicate<Integer>)(Integer t)->t%2==0).test(10);	
		System.out.println(((Predicate<Integer>)(Integer t)->t%2==0).test(10)?"Even":"Odd");
	}

}
