package LoopingAssignment;

import java.util.Scanner;

public class AllPerfectNumber {

	public static void main(String[] args) {
		int limit,no,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		limit=sc.nextInt();
		for(int i=1;i<=limit;i++) {
			no=i;
			sum=0;
			for(int j=1;j<no;j++) {
				if(no%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
		}

	}

}
