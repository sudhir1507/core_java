package com.predicate;

import java.util.function.Predicate;

public class PredicateLengthString {

	public static void main(String[] args) {
//		Predicate<String> p1=(String t)->t.length()>4;
//		Predicate<String> p2=(String t)->t.length()<=10;
//		Predicate<String> p3=p2.and(p1);
//		if(p3.test("sudhir"))
//			System.out.println("greater");
//		else
//			System.out.println("less");
        System.out.println(((Predicate<String>)(String t)->t.length()>4).and((String t)->t.length()<10).test("sudhir kadam")?"greater":"less");
	}

}
