package LoopingAssignment;

import java.util.Scanner;

public class FirstAndLastDigits {

	public static void main(String[] args) {
		int count=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int no=sc.nextInt();
		int temp=no;
		int l=no%10;
		while(no!=0) {
			no/=10;
			count++;
		}
		no=temp;
		int p=(int)Math.pow(10, --count);
		int f=no/p;
		System.out.printf("First and Last Digits= %d %d ",f,l);

	}

}
