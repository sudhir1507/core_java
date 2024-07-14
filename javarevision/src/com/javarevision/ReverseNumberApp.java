package com.javarevision;

import java.util.Scanner;

public class ReverseNumberApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt(); //1234
		int rev=0; 
		while(no!=0) {    //1234
			int r=no%10;   //12 3 4
			rev=rev*10+r;     //0+ 4 40+3=43 430+2
		    no/=10;
		}
   System.out.println("Reverse number is "+rev);
	}

}
