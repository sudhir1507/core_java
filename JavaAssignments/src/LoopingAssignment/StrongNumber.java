package LoopingAssignment;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		int no,rem,fact,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		no=sc.nextInt();
		temp=no;
		for(;no!=0;no/=10) {
			rem=no%10;
			fact=1;
			for(int j=1;j<=rem;j++) {
				fact=fact*j;
			}
			sum=sum+fact;
		}
		if(sum==temp) {
			System.out.println(temp+" is Strong Number");
		}else {
			System.out.println(temp+" is Not Strong Number");
		}
	}
}
