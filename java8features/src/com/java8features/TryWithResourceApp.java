package com.java8features;

import java.util.*;

public class TryWithResourceApp {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter two values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Division is "+c);
		}catch(ArrayIndexOutOfBoundsException|ArithmeticException|NullPointerException |InputMismatchException e) {
			String s=(e instanceof ArrayIndexOutOfBoundsException)?"Array exception "+e
					:(e instanceof ArithmeticException)?"Arithmetic Exception "+e
					:(e instanceof NullPointerException)?"Null pointer exception "+e
					:"Input mismatch exception "+e;
			System.out.println(s);
		}
	}

}
