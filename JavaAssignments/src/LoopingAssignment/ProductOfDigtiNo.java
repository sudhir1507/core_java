package LoopingAssignment;

import java.util.Scanner;

public class ProductOfDigtiNo {

	public static void main(String[] args) {
		int p=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int no=sc.nextInt();
		while(no!=0) {
			p=p*(no%10);
			no/=10;
		}
		System.out.println("Product is "+p);
		

	}

}
