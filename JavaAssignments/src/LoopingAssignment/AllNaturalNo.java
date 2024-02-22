package LoopingAssignment;

import java.util.Scanner;

public class AllNaturalNo {

	public static void main(String[] args) {
		int i=1;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit :");
		int no=sc.nextInt();
		while(i<=no) {
			System.out.println(i++);
		}

	}

}
