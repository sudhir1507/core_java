package LoopingAssignment;

import java.util.Scanner;

public class AllPrimeNo {

	public static void main(String[] args) {
		int limit,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit :");
		limit=sc.nextInt();
		for(int k=1;k<=limit;k++) {
			int no=k;
			count=0;
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(no+" ");
			}
		}

	}

}
