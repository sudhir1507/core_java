package com.javarevision;

import java.util.Scanner;

public class MutliplicationTableApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check its table ");
		int no=sc.nextInt();
		System.out.println("Table of "+no+" is");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		for(int i=1;i<=10;i++) {
			System.out.println(no+" * "+i+" = "+no*i);
		}

	}

}
