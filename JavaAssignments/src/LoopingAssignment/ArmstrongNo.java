package LoopingAssignment;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		int no,count=0,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		no=sc.nextInt();
		temp=no;
		while(no!=0) {
			count++;
			no/=10;
		}
		no=temp;
		while(no!=0) {
			
			sum=sum+(int)Math.pow((no%10), count);
			no/=10;
		}
		if(temp==sum)
			System.out.println(temp+" Is Armstrong Number");
		else
			System.out.println(temp+" is NOT Armstrong Number");
	}

}
