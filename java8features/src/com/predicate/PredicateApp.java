package com.predicate;

import java.util.function.Predicate;

public class PredicateApp {

	public static void main(String[] args) {
//		Predicate<Integer> p=new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				
//				return t>=1;
//			}
//		};
//		Predicate<Integer> p1=new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t<=10;
//			}
//		};
	
		//Predicate p2=p1.and(p);
		boolean b=((Predicate<Integer>)(Integer t)->t>=1).and((Integer t)->t<=10).test(44);
		if(b) {
			System.out.println("Number between 1 to 10");
		}else {
			System.out.println("Number NOT between 1 to 10");
		}

	}

}
