package LoopingAssignment;

import java.util.Scanner;

public class AllStrongNumber {

	public static void main(String[] args) {
		int limit,sum=0,fact,no,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit ");
		limit=sc.nextInt();
		for(int i=1;i<=limit;i++) {
			no=i;
			sum=0;
			for(;no!=0;no/=10) {
				rem=no%10;
				fact=1;
				for(int j=1;j<=rem;j++) {
					fact=fact*j;
				}
				sum=sum+fact;
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
		}

	}

}
