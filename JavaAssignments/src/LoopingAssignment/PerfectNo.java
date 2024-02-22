package LoopingAssignment;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		int no,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		no=sc.nextInt();
		for(int i=1;i<no;i++) {
			if(no%i==0) {
				sum+=i;
			}
		}
		if(sum==no) {
			System.out.println(no+" is Perfect Number ");
		}else {
			System.out.println(no+" is NOT perfect Number ");
		}

	}

}
