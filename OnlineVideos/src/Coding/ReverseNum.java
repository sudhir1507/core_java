package Coding;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("enter tne number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int rev=0;
		int rem;
		while(number!=0) {
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println(rev);
	}

}
