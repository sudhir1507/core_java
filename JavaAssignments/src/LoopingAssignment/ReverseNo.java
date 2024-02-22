package LoopingAssignment;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int no=sc.nextInt();
		while(no!=0) {
			rev=rev*10+(no%10);
			no=no/10;
		}
		System.out.println("Reverse Number is "+rev);
	}

}
