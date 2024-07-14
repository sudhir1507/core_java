package com.predicate;

import java.util.function.Predicate;

public class PredicateEvenCheck {

	public static void main(String[] args) {
//		Predicate<Integer> p=new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer t) {
//				
//				return t%2==0;
//			}
//		};
//		boolean b=p.test(10);
//		if(b) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
		
		//predicate using lambda expressions
//		Predicate<Integer> p=(Integer t)->t%2==0;
//		boolean b=p.test(10);
//		if(b) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
		
//		boolean b=((Predicate<Integer>)(Integer t)->t%2==0).test(10);
//		if(b) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
		
		
//		if(((Predicate<Integer>)(Integer t)->t%2==0).test(10)) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
	}

}
