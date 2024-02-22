package LoopingAssignment;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int no=sc.nextInt();
		while(no!=0) {
			no/=10;
			count++;
		}
		System.out.println("Number of Digits "+count);
	}

}
