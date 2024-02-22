package LoopingAssignment;

import java.util.Scanner;

public class LCMno {

	public static void main(String[] args) {
		int hcf=1,lcm=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers to find HCF ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=1;i<n1||i<n2;i++) {
			if(n1%i==0&&n2%i==0) {
				hcf=i;
			}
		}
		System.out.println("LCM is "+((n1*n2)/hcf));

	}

}
