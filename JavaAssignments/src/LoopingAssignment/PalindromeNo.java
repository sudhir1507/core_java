package LoopingAssignment;

import java.util.*;

public class PalindromeNo {

	public static void main(String[] args) {
		int rev=0,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No ");
		int no=sc.nextInt();
		temp=no;
		while(no!=0) {
			rev=rev*10+(no%10);
			no=no/10;
		}
		if(rev==temp) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
