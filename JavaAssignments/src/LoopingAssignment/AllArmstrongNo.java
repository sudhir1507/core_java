package LoopingAssignment;

import java.util.Scanner;

public class AllArmstrongNo {

	public static void main(String[] args) {
		int limit,no,temp,count,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit ");
		limit=sc.nextInt();
		for(int i=1;i<=limit;i++) {
			no=i;
			count=0;
			for(;no!=0;no/=10) {
				count++;
			}
			no=i;
			sum=0;
			for(;no!=0;no/=10) {
				sum+=(int)Math.pow((no%10), count);
				
			}
			if(sum==i)
			    System.out.print(i+" ");
		}

	}

}
