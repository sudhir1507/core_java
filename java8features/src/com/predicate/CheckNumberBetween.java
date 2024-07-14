package com.predicate;

import java.util.function.Predicate;

public class CheckNumberBetween {

	public static void main(String[] args) {
		
		
        if((((Predicate<Integer>)(Integer t)->t>=1).and(((Integer t)->t<=10))).test(2)) {
           System.out.println("Between range");	
        }else {
        	System.out.println("Out of range");
        }
	}

}
