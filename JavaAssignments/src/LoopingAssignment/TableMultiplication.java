package LoopingAssignment;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int no=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d*%d=%d\n",no,i,(no*i));
		}

	}

}
