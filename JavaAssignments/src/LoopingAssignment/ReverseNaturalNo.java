package LoopingAssignment;

import java.util.Scanner;

public class ReverseNaturalNo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit :");
		int no=sc.nextInt();
		while(no>0) {
			System.out.println(no--);
		}

	}

}
