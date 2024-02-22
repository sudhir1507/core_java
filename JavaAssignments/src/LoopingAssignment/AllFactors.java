package LoopingAssignment;

import java.util.Scanner;

public class AllFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				System.out.println(i);
			}
		}

	}

}
