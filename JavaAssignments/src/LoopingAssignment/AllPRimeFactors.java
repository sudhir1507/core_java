package LoopingAssignment;

import java.util.Scanner;

public class AllPRimeFactors {

	public static void main(String[] args) {
		int no,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count=0;
				for(int j=1;j<i;j++) {
					if(i%j==0) {
						count++;
					}
				}
				if(count==1) {
					System.out.print(i+" ");
				}
			}
		}

	}

}
