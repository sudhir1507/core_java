package LoopingAssignment;

import java.util.Scanner;

public class FreqEachDigit {

	public static void main(String[] args) {
		int temp,rev=0,fd,r,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int no=sc.nextInt();
		temp=no;
		while(no!=0) {
			int rem=no%10;
			no=no/10;
			int n=no;
			count=1;
			while(n!=0) {
				r=n%10;
				if(r==rem) {
					count++;
				}
				n/=10;
			}
			System.out.println(rem+"----->"+count);
		}

	}

}
