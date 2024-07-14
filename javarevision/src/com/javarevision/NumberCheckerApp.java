package com.javarevision;

import java.util.Scanner;

public class NumberCheckerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int no=sc.nextInt();
				
	    do {
	    	System.out.println("\n1.prime number");
	    	System.out.println("2.Armstrong number");
	    	System.out.println("3.Strong number");
	    	System.out.println("4.Perfect number");
	    	System.out.println("5.Duck number");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				int n=no;
				boolean flag=false;
				for(int i=2;i<n;i++) {
					if(n%i==0) {
						flag=true;
					}
				}
				if(!flag) {
					System.out.println("Number is  prime");
				}else {
					System.out.println("Number is not prime");
				}
				break;
			case 2:
				int a=no;
				int count=0;
				while(a!=0) {
					count++;
					a/=10;
				}
				int temp=no;
				int rem=0,sum=0;
				while(temp!=0) {
					sum=sum+(int)Math.pow(temp%10,count);
					temp/=10;
				}
				System.out.println(sum+"\t"+no);
				if(sum==no) {
					System.out.println("Number is armstrong");
				}else {
					System.out.println("Number is NOT armstrong");
				}
				break;
			case 3:
				int s=no;
				int fact=0,sm=0;
				while(s!=0) {
					int re=s%10;
					fact=1;
					for(int i=1;i<=re;i++) {
						fact=fact*i;
					}
					sm=sm+fact;
					s/=10;
				}
				System.out.println(sm+"\t"+no);
				if(sm==no) {
					System.out.println("Number is Strong");
				}else {
					System.out.println("Number is Not Strong");
				}
				
				break;
			case 4:
				int t=no;
				int psum=0;
				for(int i=1;i<no;i++) {
					if(t%i==0) {
						psum=psum+i;
					}
				}
				if(psum==no) {
					System.out.println("Perfect number");
				}else {
					System.out.println("Not Perfect number");
				}
				break;
			case 5:
				int dno=no;
				boolean f=false;
				while(dno!=0) {
					int rm=dno%10;
					if(rm==0) {
						f=true;
						break;
					}
					dno/=10;
				}
				if(f) {
					System.out.println("Numer is duck");
				}else {
					System.out.println("Number is not Duck");
				}
				break;
			default:
				System.out.println("Worng choice");
			}
		} while (true);

	}

}
