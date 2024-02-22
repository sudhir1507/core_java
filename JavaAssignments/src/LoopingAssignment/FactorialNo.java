package LoopingAssignment;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
