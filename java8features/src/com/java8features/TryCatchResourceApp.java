package com.java8features;

import java.util.*;
import java.util.Scanner;

public class TryCatchResourceApp {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Division is "+c);
		}catch(ArithmeticException|NullPointerException|InputMismatchException|ClassCastException ex) {
			String s=(ex instanceof ArithmeticException)?"Arithmetic exception "+ex:(ex instanceof NullPointerException)?"Nullponiter exception ex "+ex:
				(ex instanceof InputMismatchException)?"inputmismatchException "+ex:"classcast exception";
		    System.out.println(s);
		}

	}

}
