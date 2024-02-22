package LoopingAssignment;

import java.util.Scanner;

public class FabbonciSeries {

	public static void main(String[] args) {
		int f1=0,f2=1,fb;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of terms ");
		int n=sc.nextInt();
		System.out.print(f1+" "+f2+" ");
		for(int i=3;i<=n;i++) {
			fb=f1+f2;
			f1=f2;
			f2=fb;
			System.out.print(fb+" ");
		}

	}

}
