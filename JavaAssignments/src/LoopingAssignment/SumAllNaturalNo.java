package LoopingAssignment;

import java.util.Scanner;

public class SumAllNaturalNo {

	public static void main(String[] args) {
		int i=1,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit :");
		int no=sc.nextInt();
		while(i<=no) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
