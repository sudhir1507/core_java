package LoopingAssignment;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int no,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		no=sc.nextInt();
		for(int i=1;i<no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(no+" is prime");
		}else {
			System.out.println(no+" is NOT prime");
		}

	}

}
